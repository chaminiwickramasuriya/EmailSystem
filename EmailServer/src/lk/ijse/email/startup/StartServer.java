/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.startup;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.email.service.Impl.ServiceFactoryImpl;

/**
 *
 * @author Chamini
 */
public class StartServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Registry registry = LocateRegistry.createRegistry(7865);
            registry.rebind("email", ServiceFactoryImpl.getInstance());
            System.out.println("Server has been started successfully");
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
