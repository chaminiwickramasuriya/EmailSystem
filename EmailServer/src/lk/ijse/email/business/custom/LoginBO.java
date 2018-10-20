/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.business.custom;

import java.util.List;
import lk.ijse.email.business.SuperBO;
import lk.ijse.email.dto.LoginDTO;

/**
 *
 * @author Chamini
 */
public interface LoginBO extends SuperBO {

    public boolean addLogin(LoginDTO loginDTO) throws Exception;
    public LoginDTO searchLogin(LoginDTO loginDTO) throws Exception;
}
