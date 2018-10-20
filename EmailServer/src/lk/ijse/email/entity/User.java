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
public class User {
    @Id
      private int sID;
    private String name;
    private String type;
    private String email;

    public User() {
    }

    public User(int sID, String name, String type, String email) {
        this.sID = sID;
        this.name = name;
        this.type = type;
        this.email = email;
    }

    /**
     * @return the sID
     */
    public int getsID() {
        return sID;
    }

    /**
     * @param sID the sID to set
     */
    public void setsID(int sID) {
        this.sID = sID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "sID=" + sID + ", name=" + name + ", type=" + type + ", email=" + email + '}';
    }
    
}
