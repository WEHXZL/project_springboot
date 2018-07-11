package com.bdqn.sbproject.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
@Document(collection = "news")
public class News implements Serializable {

    private String newsTittle;

}
