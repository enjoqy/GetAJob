package org.junhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("org.junhi.mapper")  //扫描mapper接口
@EnableDiscoveryClient  //启用eureka客户端
public class SpringbootServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceProviderApplication.class, args);
    }

}
