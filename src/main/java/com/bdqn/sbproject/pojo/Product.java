package com.bdqn.sbproject.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "product")
public class Product implements Serializable {
    @Id
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





}
