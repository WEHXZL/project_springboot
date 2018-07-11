package com.bdqn.sbproject.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "about")
public class About implements Serializable {
            private Integer aboutID;//id
            private String aboutTitle;//关于我们标题
            private String aboutContext;//内容

    public About() {
    }

    public About(Integer aboutID, String aboutTitle, String aboutContext) {
        this.aboutID = aboutID;
        this.aboutTitle = aboutTitle;
        this.aboutContext = aboutContext;
    }

    public Integer getAboutID() {
        return aboutID;
    }

    public void setAboutID(Integer aboutID) {
        this.aboutID = aboutID;
    }

    public String getAboutTitle() {
        return aboutTitle;
    }

    public void setAboutTitle(String aboutTitle) {
        this.aboutTitle = aboutTitle;
    }

    public String getAboutContext() {
        return aboutContext;
    }

    public void setAboutContext(String aboutContext) {
        this.aboutContext = aboutContext;
    }
}
