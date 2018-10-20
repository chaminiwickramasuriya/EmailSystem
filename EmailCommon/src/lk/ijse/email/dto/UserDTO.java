/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.dto;

/**
 *
 * @author Chamini
 */
public class UserDTO extends SuperDTO{
    private int sID;
    private String name;
    private String type;
    private String email;

    public UserDTO() {
    }

    public UserDTO(int sID, String name, String type, String email) {
        this.sID = sID;
        this.name = name;
        this.type = type;
        this.email = email;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sID;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sID) {
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
    
    
    
}
