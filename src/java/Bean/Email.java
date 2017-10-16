/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Configs.Config;

/**
 *
 * @author Admin
 */
public class Email {

    private String EmailAddress;
    private String Subject;
    private String Body;
    private String PathFolderAttachImage;

    public Email() {
    }

    public Email(String EmailAddress, String Subject, String Body) {
        this.EmailAddress = EmailAddress;
        this.Subject = Subject;
        this.Body = Body;
    }

    public Email(String EmailAddress) {
        this.EmailAddress = EmailAddress;
        this.Subject = Config.GMAIL_SUBJECT;
        this.Body = Config.BODY_MAIL;

    }

    public String getEmailAddress() {
        return EmailAddress.trim();
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getSubject() {
        return Subject.trim();
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String Body) {
        this.Body = Body;
    }

    public String getFileNameAttachment() {
        return EmailAddress + ".jpg";
    }

    public String getPathFolderAttachImage() {
        return PathFolderAttachImage;
    }

    public void setPathFolderAttachImage(String PathFolderAttachImage) {
        this.PathFolderAttachImage = PathFolderAttachImage;
    }

}
