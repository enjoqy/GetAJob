package org.junhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author junhi
 * @date 2019/7/17 14:17
 */
//@EnableAutoConfiguration  //启用SpringBoot应用的自动配置
//@ComponentScan  //类似于<context:component-scan base-package="">
//组合注解
@SpringBootApplication
public class SpringBootdemoController {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootdemoController.class, args);
    }

}

