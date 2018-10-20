/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.business;

import lk.ijse.email.business.custom.Impl.EMailBOImpl;
import lk.ijse.email.business.custom.Impl.LoginBOImpl;

/**
 *
 * @author Chamini
 */
public class BOFactory {

    public enum BOFactoryType {

        CONTACT, EMAIL, IMAGE, LOGIN, MESSAGE, RECIEVER, USER, MAILRECIEVER
    }
    public static BOFactory bOFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (bOFactory == null) {
            bOFactory = new BOFactory();
        }
        return bOFactory;
    }

    public SuperBO getBO(BOFactoryType type) {
        switch (type) {
            case LOGIN:
                return new LoginBOImpl();
            case EMAIL:
                return new EMailBOImpl();
            default:
                return null;
        }

    }
}
