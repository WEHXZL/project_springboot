package com.bdqn.sbproject.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "about")
public class About implements Serializable {
            private String aboutTitle;
            private String aboutContext;



}
