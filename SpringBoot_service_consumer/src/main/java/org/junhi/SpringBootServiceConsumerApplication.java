package org.junhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient  // 启用注册中心eureka
//@EnableCircuitBreaker  // 开启熔断
@SpringCloudApplication  // 相当于上面三个的组合注解
@EnableFeignClients  // 启用feign组件，远程调用组件
public class SpringBootServiceConsumerApplication {

    /*@Bean  // 启用feign注解之后，这个就不需要了
    @LoadBalanced  //开启负载均衡ribbon
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServiceConsumerApplication.class, args);
    }

}
