/*
 * Project: microservice
 * File: StudentConsumerController.java
 * Created on 2019/6/11 17:40 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.controller;

import com.zqx.entity.Student;
import com.zqx.service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 服务消费者-学生信息控制器
 * 真正对外暴露，提供调用的，所以用80端口
 */
@RestController
@RequestMapping("/student")
public class StudentConsumerController {

    @Autowired
    private StudentClientService studentClientService;

    @PostMapping("/save")
    public boolean save(Student student) {
        //远程调用服务提供者的地址
        return studentClientService.save(student);
    }

    @GetMapping("/list")
    public List<Student> list() {
        return studentClientService.list();
    }

    @GetMapping(value = "get/{id}")
    public Student findById(@PathVariable("id") Integer id) {
        return studentClientService.getById(id);
    }

    @GetMapping(value = "del/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return studentClientService.del(id);
    }

    @GetMapping(value = "getInfo")
    @ResponseBody
    public Map<String, Object> getInfo() {
        return studentClientService.getInfo();
    }
}