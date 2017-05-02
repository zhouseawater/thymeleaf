package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhouhaishui on 2017/5/2.
 */
@Controller
public class pageController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String page(){
        return "system/index";
    }


    /**
     * 跳转
     * @return
     */
    @RequestMapping("info/redirect")
    public String page2(){
        return "redirect/redirect";
    }


    /**
     *视图
     * @param model
     * @return
     */
    @RequestMapping("/page")
    public String page3(Model model){
        model.addAttribute("name","seawater");
        return "hello";
    }
}
