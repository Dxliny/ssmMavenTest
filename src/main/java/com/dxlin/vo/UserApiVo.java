package com.dxlin.vo;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import com.dxlin.entity.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component(value = "userApiVo")
@Scope(value = "prototype")
public class UserApiVo {
    private int code;
    private String msg;
    private User user;

    public UserApiVo(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
