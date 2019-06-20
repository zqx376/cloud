package com.zqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 加了exclude=...后就不会自动注入数据源、数据库驱动（因为消费者这边不涉及到数据源操作）
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@EnableTurbine
public class CloudConsumerHystrixTurbineFeignConfig80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixTurbineFeignConfig80Application.class, args);
    }

}
