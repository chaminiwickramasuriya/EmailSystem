/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Chamini
 */
@Entity
public class Login {
    @Id
      private String userName;
    private String passWord;
    private String type;

    public Login() {
    }

    public Login(String userName, String passWord, String type) {
        this.userName = userName;
        this.passWord = passWord;
        this.type = type;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Login{" + "userName=" + userName + ", passWord=" + passWord + ", type=" + type + '}';
    }
    
}
