package com.bdqn.sbproject.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "recruitment")
public class Recruitment implements Serializable {
    @Id
    private Integer recruitmentID;//人才招聘id
    private String recruitJob;//招聘职位
    private Date recruitTime;//发布时间
    private String recruitQuali;//任职要求
    private String recruitContact;//联系人
    private String recruitPhone;//联系方式
    private String recruitEmail;//邮箱

    public Recruitment() {
    }

    public Recruitment(Integer recruitmentID, String recruitJob, Date recruitTime, String recruitQuali, String recruitContact, String recruitPhone, String recruitEmail) {
        this.recruitmentID = recruitmentID;
        this.recruitJob = recruitJob;
        this.recruitTime = recruitTime;
        this.recruitQuali = recruitQuali;
        this.recruitContact = recruitContact;
        this.recruitPhone = recruitPhone;
        this.recruitEmail = recruitEmail;
    }

    public Integer getRecruitmentID() {
        return recruitmentID;
    }

    public void setRecruitmentID(Integer recruitmentID) {
        this.recruitmentID = recruitmentID;
    }

    public String getRecruitJob() {
        return recruitJob;
    }

    public void setRecruitJob(String recruitJob) {
        this.recruitJob = recruitJob;
    }

    public Date getRecruitTime() {
        return recruitTime;
    }

    public void setRecruitTime(Date recruitTime) {
        this.recruitTime = recruitTime;
    }

    public String getRecruitQuali() {
        return recruitQuali;
    }

    public void setRecruitQuali(String recruitQuali) {
        this.recruitQuali = recruitQuali;
    }

    public String getRecruitContact() {
        return recruitContact;
    }

    public void setRecruitContact(String recruitContact) {
        this.recruitContact = recruitContact;
    }

    public String getRecruitPhone() {
        return recruitPhone;
    }

    public void setRecruitPhone(String recruitPhone) {
        this.recruitPhone = recruitPhone;
    }

    public String getRecruitEmail() {
        return recruitEmail;
    }

    public void setRecruitEmail(String recruitEmail) {
        this.recruitEmail = recruitEmail;
    }
}
