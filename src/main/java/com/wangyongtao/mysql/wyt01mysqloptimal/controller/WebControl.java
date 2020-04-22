package com.wangyongtao.mysql.wyt01mysqloptimal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@ClassName WebControl
 *@Description 测试接口类
 *@Author wangyongtao
 *@Date 2020/4/10 17:08
 *@Version 1.0
 */
@Controller
public class WebControl {

    @RequestMapping("/getString")
    @ResponseBody
    public String getString(){
        return "success";
    }


}
