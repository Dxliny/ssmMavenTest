package com.dxlin.service.Impl;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import com.dxlin.dao.UserDao;
import com.dxlin.entity.User;
import com.dxlin.service.UserService;
import com.dxlin.vo.UserApiVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "userService")
public class UserServiceImPl implements UserService{

    @Resource
    UserDao userDao;
    @Resource
    UserApiVo userApiVo;

    public UserApiVo getUserApiById(int id) {
        User user = userDao.findUserById(id);
        if(user==null){
            userApiVo.setCode(0);
            userApiVo.setMsg("not find user");
            userApiVo.setUser(null);
        }else {
            userApiVo.setCode(1);
            userApiVo.setMsg("success find user");
            userApiVo.setUser(user);
        }
        return userApiVo;
    }

}
