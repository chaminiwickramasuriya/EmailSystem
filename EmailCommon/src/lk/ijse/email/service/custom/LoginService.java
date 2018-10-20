/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.service.custom;

import java.util.List;
import lk.ijse.email.dto.LoginDTO;
import lk.ijse.email.service.SuperService;

/**
 *
 * @author Chamini
 */
public interface LoginService extends SuperService {

    public boolean addLogin(LoginDTO loginDTO) throws Exception;
    public LoginDTO searchLogin(LoginDTO loginDTO) throws Exception;
}
