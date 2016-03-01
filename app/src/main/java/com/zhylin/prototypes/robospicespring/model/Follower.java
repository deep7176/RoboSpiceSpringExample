package com.zhylin.prototypes.robospicespring.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by deeptaco on 2/29/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Follower {

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}