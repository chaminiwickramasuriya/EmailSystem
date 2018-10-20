/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.service;

import java.rmi.Remote;

/**
 *
 * @author Chamini
 */
public interface ServiceFactory extends Remote{
    public enum serviceType{
         //CONTACT,EMAIL,IMAGE,LOGIN,MESSAGE,RECIEVER,USER,MAILRECIEVER
        LOGIN,EMAIL
    }
    public SuperService getService(serviceType type) throws Exception;
}
