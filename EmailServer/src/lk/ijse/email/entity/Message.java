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
public class Message {
    @Id
     private int cID;
    private int mID;
    private String date;
    private String time;
    private String content;
    

    public Message() {
    }

    public Message(int cID, int mID, String date, String time, String content) {
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

    @Override
    public String toString() {
        return "Message{" + "cID=" + cID + ", mID=" + mID + ", date=" + date + ", time=" + time + ", content=" + content + '}';
    }
    
}
