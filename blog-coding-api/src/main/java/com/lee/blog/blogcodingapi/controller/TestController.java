package com.lee.blog.blogcodingapi.controller;

import com.lee.blog.blogcodingmodel.model.FireZqyj;
import com.lee.blog.blogcodingservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/zqInfo")
    public FireZqyj getZqInfo(){
        return testService.getZqInfo();
    }
}
