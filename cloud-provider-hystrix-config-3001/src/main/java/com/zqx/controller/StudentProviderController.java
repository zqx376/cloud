/*
 * Project: microservice
 * File: StudentController.java
 * Created on 2019/6/11 15:53 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.controller;

import com.zqx.entity.Student;
import com.zqx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 服务提供者-学生信息控制器
 */
@RestController
@RequestMapping("/student")
public class StudentProviderController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public boolean save(@RequestBody Student student){//所有的提供者参数是实体的（不是普通类型）都要加@RequestBody，因为它本身有保护机制
        try {
            studentService.save(student);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @GetMapping("/list")
    public List<Student> list(){
        System.out.println("list-----------3001");
        return studentService.list();
    }

    @GetMapping(value = "get/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }

    @GetMapping(value = "del/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try {
            studentService.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 获取信息
     * @return
     * @throws InterruptedException
     */
    @ResponseBody //因为返回的是ajax，所以用这个注解
    @GetMapping("/getInfo")
    public Map<String,Object> getInfo() throws InterruptedException{
        //Thread.sleep(3300);
        return studentService.getInfo();
    }
}
