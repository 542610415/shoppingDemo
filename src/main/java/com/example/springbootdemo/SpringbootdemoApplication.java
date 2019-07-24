package com.example.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})//排除其注入
public class SpringbootdemoApplication {
    private static final Logger LOGO = LoggerFactory.getLogger(SpringbootdemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
        LOGO.info("======================this project run success!====================");
    }

}
