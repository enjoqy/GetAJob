package org.junhi.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.junhi.client.UserClient;
import org.junhi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/18 14:05
 */
@Controller
@RequestMapping("/consumer/user")
//@DefaultProperties(defaultFallback = "fallbackMethod")  // 指定全局的熔断方法
public class UserController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    UserClient userClient;

    /**
     * 包含了拉取的所有服务信息
     */
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping
    @ResponseBody
    @HystrixCommand  // 局部的熔断时指定应急的方法，会返回一个友好的提示 @HystrixCommand(fallbackMethod = "queryUserByIdFallback")
    public String queryUserById(@RequestParam("id")Integer id){
//        List<ServiceInstance> instanceList = discoveryClient.getInstances("service-provider");
//        ServiceInstance instance = instanceList.get(0);
//        return this.restTemplate.getForObject("http://service-provider/user/" + id, String.class);
        return this.userClient.queryUserById(id);
    }

    public String fallbackMethod(){
        return "服务正忙，请稍后再试";
    }

}
