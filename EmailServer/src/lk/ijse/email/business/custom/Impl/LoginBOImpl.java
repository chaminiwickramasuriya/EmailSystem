/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.business.custom.Impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.email.business.custom.LoginBO;
import lk.ijse.email.dto.LoginDTO;
import lk.ijse.email.entity.Login;
import lk.ijse.email.repository.RepositoryFactory;
import lk.ijse.email.repository.custom.LoginRepository;
import lk.ijse.email.resources.NewHibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author Chamini
 */
public class LoginBOImpl implements LoginBO{
    
    private LoginRepository LoginRepository;
    
    public LoginBOImpl(){
        LoginRepository=(LoginRepository) RepositoryFactory.getRepositoryFactory().getRepository(RepositoryFactory.repositoryType.LOGIN);
    }
    @Override
    public boolean addLogin(LoginDTO loginDTO) throws Exception {
         System.out.println("BOIMPL:"+loginDTO);
       try(Session session=NewHibernateUtil.getSessionFactory().openSession()){
           LoginRepository.setSession(session);
           session.beginTransaction();
           
           Login login=new Login(loginDTO.getUserName(), loginDTO.getPassWord(), loginDTO.getType());
          
           boolean save = LoginRepository.save(login);
            session.getTransaction().commit();
            return save;
       }
            
    }

    @Override
    public LoginDTO searchLogin(LoginDTO loginDTO) throws Exception {
        try(Session session=NewHibernateUtil.getSessionFactory().openSession() ){
            LoginRepository.setSession(session);
            session.beginTransaction();
            List<Login>log=LoginRepository.findAll();
            session.getTransaction().commit();

            if (log != null) {

                List<LoginDTO> logDTO = new ArrayList<>();

                for (LoginDTO logDTO1 : logDTO) {
                    LoginDTO login=new LoginDTO(logDTO1.getUserName(), logDTO1.getPassWord(), logDTO1.getType());
                    logDTO.add(login);
                }

                return loginDTO;

            } else {

                return null;
            }
            
        }
    }

    
    }

    
   
     
