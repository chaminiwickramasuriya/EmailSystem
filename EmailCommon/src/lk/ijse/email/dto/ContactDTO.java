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
public class ContactDTO extends SuperDTO{
    private int sID;
    private int cID;
    private String nameCon;

    public ContactDTO() {
    }

    public ContactDTO(int sID, int cID, String nameCon) {
        this.sID = sID;
        this.cID = cID;
        this.nameCon = nameCon;
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
     * @return the cID
     */
    public int getcID() {
        return cID;
    }

    /**
     * @param cID the cID to set
     */
    public void setcID(int cID) {
        this.cID = cID;
    }

    /**
     * @return the nameCon
     */
    public String getNameCon() {
        return nameCon;
    }

    /**
     * @param nameCon the nameCon to set
     */
    public void setNameCon(String nameCon) {
        this.nameCon = nameCon;
    }
    
    
    
}
