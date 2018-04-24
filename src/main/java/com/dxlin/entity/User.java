package com.dxlin.entity;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "user")
@Scope(value = "prototype")
public class User {
    private int id;
    private String name_tb;
    private String username;
    private String password;
    private String photo;


    public User(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_tb() {
        return name_tb;
    }

    public void setName_tb(String name_tb) {
        this.name_tb = name_tb;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
