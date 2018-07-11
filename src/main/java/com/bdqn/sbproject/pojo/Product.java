package com.bdqn.sbproject.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "product")
public class Product implements Serializable {
    @Id
    private Integer productID;//id
    private String proTittle;//标题
    //冲击钻
    private String proID;//商品编号
    private String proWeight;//商品毛重
    private String electrodrill;//电钻类
    private String proPower;//额定功率
    private String proRate;//速率
    private String maxiDrill;//最大钻孔直径
    private String maxCollet;//最大夹头直径

    //电钻
    private String proModel;//产品型号
    private String proVoltage;//电池电压
    private String proScrew;//螺钉


    //液压机
    private String proSpecs;//规格
    private String proPrice;//产品价格
    private String proPoint;//产品特点
    private String operationPanel;//操作面板

    private String proImg;//图片


    public Product() {
    }

    public Product(Integer productID, String proTittle, String proID, String proWeight, String electrodrill, String proPower, String proRate, String maxiDrill, String maxCollet, String proModel, String proVoltage, String proScrew, String proSpecs, String proPrice, String proPoint, String operationPanel, String proImg) {
        this.productID = productID;
        this.proTittle = proTittle;
        this.proID = proID;
        this.proWeight = proWeight;
        this.electrodrill = electrodrill;
        this.proPower = proPower;
        this.proRate = proRate;
        this.maxiDrill = maxiDrill;
        this.maxCollet = maxCollet;
        this.proModel = proModel;
        this.proVoltage = proVoltage;
        this.proScrew = proScrew;
        this.proSpecs = proSpecs;
        this.proPrice = proPrice;
        this.proPoint = proPoint;
        this.operationPanel = operationPanel;
        this.proImg = proImg;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProTittle() {
        return proTittle;
    }

    public void setProTittle(String proTittle) {
        this.proTittle = proTittle;
    }

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

    public String getProModel() {
        return proModel;
    }

    public void setProModel(String proModel) {
        this.proModel = proModel;
    }

    public String getProVoltage() {
        return proVoltage;
    }

    public void setProVoltage(String proVoltage) {
        this.proVoltage = proVoltage;
    }

    public String getProScrew() {
        return proScrew;
    }

    public void setProScrew(String proScrew) {
        this.proScrew = proScrew;
    }

    public String getProSpecs() {
        return proSpecs;
    }

    public void setProSpecs(String proSpecs) {
        this.proSpecs = proSpecs;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getProPoint() {
        return proPoint;
    }

    public void setProPoint(String proPoint) {
        this.proPoint = proPoint;
    }

    public String getOperationPanel() {
        return operationPanel;
    }

    public void setOperationPanel(String operationPanel) {
        this.operationPanel = operationPanel;
    }

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }
}
