package com.bdqn.sbproject.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Document(collection = "news")
public class News implements Serializable {

    private Integer newsID;//新闻id
    private String newsTittle;//新闻中心标题
    private String newsColumn;//栏目
    private String newsImg;//新闻图片;
    private String newsTime;//新闻时间
    private String newsText;//新闻栏目内容

    public News() {
    }

    public News(Integer newsID, String newsTittle, String newsColumn, String newsImg, String newsTime, String newsText) {

        this.newsID = newsID;
        this.newsTittle = newsTittle;
        this.newsColumn = newsColumn;
        this.newsImg = newsImg;
        this.newsTime = newsTime;
        this.newsText = newsText;
    }

    public Integer getNewsID() {
        return newsID;
    }

    public void setNewsID(Integer newsID) {
        this.newsID = newsID;
    }

    public String getNewsTittle() {
        return newsTittle;
    }

    public void setNewsTittle(String newsTittle) {
        this.newsTittle = newsTittle;
    }

    public String getNewsColumn() {
        return newsColumn;
    }

    public void setNewsColumn(String newsColumn) {
        this.newsColumn = newsColumn;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }
}
