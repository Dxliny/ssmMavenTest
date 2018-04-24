package com.dxlin.util;/*
 *@Author:dxlin
 *@Description：
 *@Date: 2018-3-
 */

import net.sf.json.JSONObject;

public class formatUtil {

    public static String format(int code,String msg,Object object){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        jsonObject.put("date",object);

        return jsonObject.toString();
    }

}
