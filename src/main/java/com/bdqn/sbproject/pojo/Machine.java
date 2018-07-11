package com.bdqn.sbproject.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection="machine")
public class Machine implements Serializable{
    @Id
    private Integer id;
    private String imgUrl;

    public Machine() {
    }

    public Machine(Integer id, String imgUrl) {
        this.id = id;
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
