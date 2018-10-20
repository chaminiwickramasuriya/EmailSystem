/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.repository.custom.Impl;


import java.io.Serializable;
import java.util.List;
import lk.ijse.email.entity.Login;
import lk.ijse.email.repository.SuperRepositoryImpl;
import lk.ijse.email.repository.custom.LoginRepository;
import org.hibernate.Session;


/**
 *
 * @author Chamini
 */
public class LoginRepositoryImpl extends SuperRepositoryImpl<Login, String>implements LoginRepository{
  
    public LoginRepositoryImpl(){
        
    }

    
}
