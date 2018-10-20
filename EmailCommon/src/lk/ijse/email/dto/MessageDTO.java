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
public class MessageDTO extends SuperDTO{
    private int cID;
    private int mID;
    private String date;
    private String time;
    private String content;

    public MessageDTO() {
    }

    public MessageDTO(int cID, int mID, String date, String time, String content) {
        this.cID = cID;
        this.mID = mID;
        this.date = date;
        this.time = time;
        this.content = content;
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
     * @return the mID
     */
    public int getmID() {
        return mID;
    }

    /**
     * @param mID the mID to set
     */
    public void setmID(int mID) {
        this.mID = mID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    
    
}
