package com.zhylin.prototypes.robospicespring.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.realm.RealmObject;

/**
 * Created by deeptaco on 2/29/16.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result extends RealmObject{
    private int userId;
    private int id;
    private String title;
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}