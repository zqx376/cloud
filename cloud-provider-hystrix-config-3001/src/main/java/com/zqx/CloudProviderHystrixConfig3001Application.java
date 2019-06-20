package com.zqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka客户端
@EnableCircuitBreaker //断路器注解
public class CloudProviderHystrixConfig3001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixConfig3001Application.class, args);
    }

}
