package org.junhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junhi
 * @date 2019/7/17 14:21
 */
@RestController
@RequestMapping("/hello2")
public class HelloController2 {

    @RequestMapping("/show2")
    public String show2(){
        return "SpringBoot Hello World!， 第二个";
    }

}
