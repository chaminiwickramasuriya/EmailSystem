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
public class ImageDTO extends SuperDTO{
     private String id;
    private String image;
    private int sID;

    public ImageDTO() {
    }

    public ImageDTO(String id, String image, int sID) {
        this.id = id;
        this.image = image;
        this.sID = sID;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
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
    
    
}
