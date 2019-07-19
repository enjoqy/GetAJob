package org.junhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  // 启用zuul组件
@EnableDiscoveryClient  // 启用eureka客户端
public class SpringbootZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootZuulApplication.class, args);
    }

}
