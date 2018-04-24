package com.dxlin.controller;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import com.dxlin.util.FileUpLoadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
public class testFileUpload {
    @RequestMapping(value = "fileUpload2",produces = "text/json;charset=utf-8")
    @ResponseBody
    public String  fileUpload2(@RequestParam("picfile") CommonsMultipartFile[] files, HttpServletRequest request) throws IOException {
        String filepaths = "";
        for(CommonsMultipartFile file:files){
            filepaths = filepaths+ FileUpLoadUtil.upLoadFile(file,request)+";";
        }

        return filepaths;
    }
}
