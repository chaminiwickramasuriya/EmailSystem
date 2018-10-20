/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.business.custom;

import lk.ijse.email.business.SuperBO;
import lk.ijse.email.dto.EmailDTO;
import lk.ijse.email.dto.MessageDTO;

/**
 *
 * @author Chamini
 */
public interface EMailBO extends SuperBO{
    public boolean addEMail(EmailDTO emailDTO,MessageDTO msgDTO)throws Exception;
}
