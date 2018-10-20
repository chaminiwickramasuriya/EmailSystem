/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.service.custom.Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.email.business.BOFactory;
import lk.ijse.email.business.custom.EMailBO;
import lk.ijse.email.dto.EmailDTO;
import lk.ijse.email.observer.Observer;
import lk.ijse.email.observer.Subject;
import lk.ijse.email.service.custom.EMailService;

/**
 *
 * @author Chamini
 */
public class EMailServiceImpl extends UnicastRemoteObject implements EMailService,Subject{
    
    public EMailBO emailBO;
    private static ArrayList<Observer>alObserver=new ArrayList<>();
    
    
    public EMailServiceImpl()throws RemoteException{
        this.emailBO=(EMailBO) BOFactory.getInstance().getBO(BOFactory.BOFactoryType.EMAIL);
    } 

    @Override
    public boolean addEmail(EmailDTO emailDTO) throws Exception {
        boolean addEMail = emailBO.addEMail(emailDTO);
        notifyObserver();
        return addEMail;
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        alObserver.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
       alObserver.remove(observer);
    }

    @Override
    public void notifyObserver() throws Exception {
        new Thread(() -> {
            for (Observer observer : alObserver) {
                try {
                    observer.updateObsrver();
                } catch (Exception ex) {
                    Logger.getLogger(EMailServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
    
}
