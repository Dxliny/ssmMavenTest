package com.dxlin.util;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import org.springframework.http.HttpRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class FileUpLoadUtil {
    public static String upLoadFile(CommonsMultipartFile file,HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("upload/imgs/");
        String filepath = path+file.getOriginalFilename();
        File file1 = new File(filepath);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filepath;
    }
}
