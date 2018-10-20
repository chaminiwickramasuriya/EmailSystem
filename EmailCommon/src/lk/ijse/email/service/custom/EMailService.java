/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.service.custom;

import lk.ijse.email.dto.EmailDTO;
import lk.ijse.email.service.SuperService;

/**
 *
 * @author Chamini
 */
public interface EMailService extends SuperService{
    public boolean addEmail(EmailDTO emailDTO )throws Exception;
}
