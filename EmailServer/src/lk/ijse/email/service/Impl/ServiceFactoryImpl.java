/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.service.Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.email.service.ServiceFactory;
import lk.ijse.email.service.SuperService;
import lk.ijse.email.service.custom.Impl.EMailServiceImpl;
import lk.ijse.email.service.custom.Impl.LoginServiceImpl;

/**
 *
 * @author Chamini
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    
  public static ServiceFactory serviceFactory;
    
    private ServiceFactoryImpl() throws RemoteException{
        
    }
    
    public static ServiceFactory getInstance() throws RemoteException{
        if (serviceFactory == null){
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    

    @Override
    public SuperService getService(serviceType type)throws Exception{
        switch(type){
            case LOGIN:
                return new LoginServiceImpl();
            case EMAIL:
                return new EMailServiceImpl();
                default:
                    return null;
        }
      
    }

    
    
}
