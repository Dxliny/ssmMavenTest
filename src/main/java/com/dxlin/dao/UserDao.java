package com.dxlin.dao;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import com.dxlin.entity.User;

import java.util.List;

public interface UserDao {

    public User findUserById(int id);

    public List<String> findAllName();
}
