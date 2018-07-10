package com.lee.blog.blogcodingservice.service;

import com.lee.blog.blogcodingmodel.model.FireZqyj;
import com.lee.blog.blogcodingrepo.mapper.ZqyjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private ZqyjRepository zqyjRepository;

    public FireZqyj getZqInfo() {
        return zqyjRepository.findById("284ec875bb514b8d9cd059919f316c3d").get();
    }
}
