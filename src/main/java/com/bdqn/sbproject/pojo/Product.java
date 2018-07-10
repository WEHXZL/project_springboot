package com.bdqn.sbproject.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "product")
public class Product {
    @Id
    private String proID;
    private String proWeight;
    private String electrodrill;
    private String proPower;
    private String proRate;
    private String maxiDrill;
    private String maxCollet;
    private List<Comment> comment;

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProWeight() {
        return proWeight;
    }

    public void setProWeight(String proWeight) {
        this.proWeight = proWeight;
    }

    public String getElectrodrill() {
        return electrodrill;
    }

    public void setElectrodrill(String electrodrill) {
        this.electrodrill = electrodrill;
    }

    public String getProPower() {
        return proPower;
    }

    public void setProPower(String proPower) {
        this.proPower = proPower;
    }

    public String getProRate() {
        return proRate;
    }

    public void setProRate(String proRate) {
        this.proRate = proRate;
    }

    public String getMaxiDrill() {
        return maxiDrill;
    }

    public void setMaxiDrill(String maxiDrill) {
        this.maxiDrill = maxiDrill;
    }

    public String getMaxCollet() {
        return maxCollet;
    }

    public void setMaxCollet(String maxCollet) {
        this.maxCollet = maxCollet;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
