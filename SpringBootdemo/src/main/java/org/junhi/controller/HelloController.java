package org.junhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author junhi
 * @date 2019/7/17 12:26
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/show")
    public String show(){
        return "SpringBoot Hello World!";
    }



}
