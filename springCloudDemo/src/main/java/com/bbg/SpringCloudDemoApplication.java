package com.bbg;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@MapperScan("com.bbg.mapper")
//Mybatis plus 集成Druid需要排除原生Druid的快速配置类
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class SpringCloudDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoApplication.class, args);
    }
}
