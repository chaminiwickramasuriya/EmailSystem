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
public class EmailDTO extends SuperDTO{
    private int eID;
    private int sID;
    private int mID;
    private String attaches;
    private String content;
    private String subject;
     private String name;
    private String date;
    private String time;
    private String type;

    public EmailDTO() {
    }

    public EmailDTO(int eID, int sID, int mID, String attaches, String content, String subject, String name, String date, String time, String type) {
        this.eID = eID;
        this.sID = sID;
        this.mID = mID;
        this.attaches = attaches;
        this.content = content;
        this.subject = subject;
        this.name = name;
        this.date = date;
        this.time = time;
        this.type = type;
    }
     public EmailDTO( String attaches, String content, String subject, String name, String date, String time, String type) {
        this.attaches = attaches;
        this.content = content;
        this.subject = subject;
        this.name = name;
        this.date = date;
        this.time = time;
        this.type = type;
    }

    
    /**
     * @return the eID
     */
    public int geteID() {
        return eID;
    }

    /**
     * @param eID the eID to set
     */
    public void seteID(int eID) {
        this.eID = eID;
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
     * @return the attaches
     */
    public String getAttaches() {
        return attaches;
    }

    /**
     * @param attaches the attaches to set
     */
    public void setAttaches(String attaches) {
        this.attaches = attaches;
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

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
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

   
}
