/*
 * Project: microservice
 * File: StudentClientService.java
 * Created on 2019/6/13 9:39 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/13 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.service;

import com.zqx.entity.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Feign负载均衡，创建一个消费者通用接口，减少消费者端的代码复用，达成mvc模式，同时把服务提供者的集群名称写到了公用模块，没有暴露到消费者端
 * 这边写的就和前面课程的消费端写controller类似，其他地方要调用，只要把这个对象注入就好了
 */
//通过value指定是哪个服务（服务提供者的集群名称）
//Hystrix断路器：fallbackFactory服务熔断降级指定类
@FeignClient(value = "cloud-student",fallbackFactory = StudentClientFallbackFactory.class)
public interface StudentClientService {

    @PostMapping("/student/save")
    public boolean save(Student student);

    @GetMapping("/student/list")
    public List<Student> list();

    @GetMapping("/student/get/{id}")
    public Student getById(@PathVariable("id") Integer id);

    @GetMapping("/student/del/{id}")
    public Boolean del(@PathVariable("id") Integer id);

    @GetMapping("/student/getInfo")
    @ResponseBody
    public Map<String,Object> getInfo();
}
