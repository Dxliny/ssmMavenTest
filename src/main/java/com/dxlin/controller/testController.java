package com.dxlin.controller;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import com.dxlin.dao.UserDao;
import com.dxlin.entity.User;
import com.dxlin.util.formatUtil;
import com.dxlin.service.UserService;
import com.dxlin.vo.UserApiVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class testController {
    @Resource
    private UserService userService;
    @Resource
    private UserApiVo userApiVo;
    @Resource
    private User user;
    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/hello",produces = "text/json&charset=UTF-8")
    @ResponseBody
    public String hello(int id){
        if(id<=0){
            userApiVo.setCode(0);
            userApiVo.setMsg("input erro");
            userApiVo.setUser(null);
        }else {
            userApiVo = userService.getUserApiById(id);
        }
        return formatUtil.format(userApiVo.getCode(),userApiVo.getMsg(),userApiVo.getUser());
    }

    @RequestMapping(value = "/hello2",produces = "text/json&charset=UTF-8")
    @ResponseBody
    public String hello2() {
        List<String> names = userDao.findAllName();
        for(String str:names){
            System.out.println(str);
        }
        return "success";
    }
}
