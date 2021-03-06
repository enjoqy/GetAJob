package org.junhi.config;

import org.junhi.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器，
 * 1.生命该类是一个配置类
 * 2、实现WebMvcConfigurer接口
 *
 * @author junhi
 * @date 2019/7/17 16:14
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // /*拦截一级目录，/**拦截所有
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
