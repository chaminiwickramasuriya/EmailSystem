/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.repository;

import lk.ijse.email.repository.custom.Impl.EMailRepositoryImpl;
import lk.ijse.email.repository.custom.Impl.LoginRepositoryImpl;

/**
 *
 * @author Chamini
 */
public class RepositoryFactory {
    public enum repositoryType{
        CONTACT,EMAIL,IMAGE,LOGIN,MESSAGE,RECIEVER,USER,MAILRECIEVER
    }
    
    public static RepositoryFactory repositoryFactory;
    
    private RepositoryFactory(){
        
    }
    public static RepositoryFactory getRepositoryFactory(){
        if(repositoryFactory==null){
            repositoryFactory=new RepositoryFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(repositoryType type){
        switch(type){
            case LOGIN:
                return new LoginRepositoryImpl();
                case EMAIL:
                    return new EMailRepositoryImpl();
            default:
                return null;
          
        }
        
    }
    
}
