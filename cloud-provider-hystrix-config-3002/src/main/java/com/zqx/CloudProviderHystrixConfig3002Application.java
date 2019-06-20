package com.zqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //断路器注解
public class CloudProviderHystrixConfig3002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixConfig3002Application.class, args);
    }

}
