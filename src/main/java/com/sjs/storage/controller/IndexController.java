package com.sjs.storage.controller;

import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/ws")
@Slf4j
public class IndexController {
//    @Resource
//    private RedisOperator redisOperator;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView("socket");
//        mav.addObject("uid", RandomUtil.getRandomLetter(6, RandomUtil.CodeType.ALL_NUMBER));
        mav.addObject("uid", RandomUtil.randomNumbers(6));
        return mav;
    }
}