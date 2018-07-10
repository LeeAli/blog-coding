package com.lee.blog.blogcodingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages = {"com.lee.blog.blogcodingmodel.model"})
@EnableJpaRepositories(basePackages = {"com.lee.blog.blogcodingrepo.mapper"})
@ComponentScans({
        @ComponentScan(basePackages = {"com.lee.blog.blogcodingservice.service"}),
})
@SpringBootApplication
public class BlogCodingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogCodingApiApplication.class, args);
    }
}
