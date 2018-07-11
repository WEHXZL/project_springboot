package com.bdqn.sbproject.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "news")
public class News implements Serializable {
    @Id
    private Integer newsID;//新闻id
    private String newsType;//新闻种类
    private String newsTitle;//新闻标题
    private String newsImg;//新闻图片;
    private Date newsTime;//新闻时间
    private String newsText;//新闻内容

    public News() {
    }

    public News(Integer newsID, String newsType, String newsTitle, String newsImg, Date newsTime, String newsText) {
        this.newsID = newsID;
        this.newsType = newsType;
        this.newsTitle = newsTitle;
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

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }
}
