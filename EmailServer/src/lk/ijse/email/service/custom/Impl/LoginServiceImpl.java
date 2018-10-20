/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.service.custom.Impl;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.email.business.BOFactory;
import lk.ijse.email.business.custom.LoginBO;
import lk.ijse.email.dto.LoginDTO;
import lk.ijse.email.observer.Observer;
import lk.ijse.email.observer.Subject;
import lk.ijse.email.reservationImpl.ReservationImpl;
import lk.ijse.email.service.custom.LoginService;

/**
 *
 * @author Chamini
 */
public class LoginServiceImpl extends UnicastRemoteObject implements LoginService, Subject {

    private LoginBO loginBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
   

    public LoginServiceImpl() throws Exception {
        loginBO = (LoginBO) BOFactory.getInstance().getBO(BOFactory.BOFactoryType.LOGIN);
    }

    @Override
    public boolean addLogin(LoginDTO loginDTO) throws Exception {
         System.out.println("LOgin service"+loginDTO);
        boolean result = loginBO.addLogin(loginDTO);
          System.out.println("LOgin result"+result);
        return result;
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyObserver() throws Exception {//data ek ui wala e welema pennan one nam
        new Thread(() -> {
            for (Observer observer : alObservers) {
                try {
                    observer.updateObsrver();
                } catch (Exception ex) {
                    Logger.getLogger(LoginServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public LoginDTO searchLogin(LoginDTO loginDTO) throws Exception {
        return loginBO.searchLogin(loginDTO);
    }


}
