/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.Controller;

import java.util.List;
import lk.ijse.email.dto.LoginDTO;
import lk.ijse.email.observer.Subject;
import lk.ijse.email.proxy.ProxyHandler;
import lk.ijse.email.service.ServiceFactory;
import lk.ijse.email.service.custom.LoginService;

/**
 *
 * @author Chamini
 */
public class LoginController {

    public static boolean addLogin(LoginDTO loginDTO) throws Exception {
        LoginService loginService = (LoginService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.LOGIN);

        boolean addLogin = loginService.addLogin(loginDTO);
       
        return addLogin;
    }

    public static Subject getSubject() throws Exception {
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.LOGIN);
    }
    
//   public static List<LoginDTO> searchLogin() throws Exception{
//        LoginService loginService = (LoginService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.LOGIN);
//        return loginService.searchLogin();
//    }
     public static LoginDTO search(LoginDTO login) throws Exception{
      LoginService loginService= (LoginService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.LOGIN);
      return loginService.searchLogin(login);
    }
  
}
   

