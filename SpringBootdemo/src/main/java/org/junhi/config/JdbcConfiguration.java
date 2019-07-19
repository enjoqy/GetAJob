package org.junhi.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 配置类
 * @author junhi
 * @date 2019/7/17 14:32
 */

/**
 * 生命这个类是一个配置类相当于一个xml配置
 */
//@PropertySource("classpath:jdbc.properties") //读取资源文件
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)  //启用配置文件
public class JdbcConfiguration {

//    @Value("${jdbc.driver}")
//    private String driver;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;

    @Autowired
    private JdbcProperties jdbcProperties;

//    @ConfigurationProperties(prefix = "jdbc")
    @Bean  //把方法的返回值注入到Spring容器
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriver());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }
}
