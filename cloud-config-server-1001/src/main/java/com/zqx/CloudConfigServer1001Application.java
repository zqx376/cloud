package com.zqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServer1001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServer1001Application.class, args);
    }

}
