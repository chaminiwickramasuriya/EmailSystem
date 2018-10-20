/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.email.service.ServiceFactory;
import lk.ijse.email.service.SuperService;
import lk.ijse.email.service.custom.EMailService;
import lk.ijse.email.service.custom.LoginService;

/**
 *
 * @author Chamini
 */
public class ProxyHandler implements ServiceFactory {

    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private LoginService loginServce;
    private EMailService emailService;

    private ProxyHandler() {
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:7865/email");
            loginServce = (LoginService) serviceFactory.getService(serviceType.LOGIN);
            emailService = (EMailService) serviceFactory.getService(serviceType.EMAIL);
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ProxyHandler getInstance() {
        if (proxyHandler == null) {
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperService getService(serviceType type) throws Exception {
        switch (type) {
            case LOGIN:
                return loginServce;
            case EMAIL:
                return emailService;
            default:
                return null;
        }

    }

}
