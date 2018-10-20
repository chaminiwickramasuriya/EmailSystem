/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.Controller;

import lk.ijse.email.dto.EmailDTO;
import lk.ijse.email.proxy.ProxyHandler;
import lk.ijse.email.service.ServiceFactory;
import lk.ijse.email.service.custom.EMailService;

/**
 *
 * @author Chamini
 */
public class EMailController {
    public static boolean addEmail(EmailDTO emailDTO )throws Exception{
        EMailService service=(EMailService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.EMAIL );
        boolean addEmail = service.addEmail(emailDTO);
        return addEmail;
    }
}
