package com.zqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //eureka服务注册中心必须加的注解
public class CloudEurekaServerConfig2002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServerConfig2002Application.class, args);
    }

}
