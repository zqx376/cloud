/*
 * Project: microservice
 * File: StudentClientFallbackFactory.java
 * Created on 2019/6/14 19:02 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/14 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.service;

import com.zqx.entity.Student;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务熔断降级
 */
@Component
public class StudentClientFallbackFactory implements FallbackFactory<StudentClientService> {
    @Override
    public StudentClientService create(Throwable throwable) {
        return new StudentClientService() {
            @Override
            public boolean save(Student student) {
                return false;
            }

            @Override
            public List<Student> list() {
                return null;
            }

            @Override
            public Student getById(Integer id) {
                return null;
            }

            @Override
            public Boolean del(Integer id) {
                return null;
            }

            @Override
            public Map<String, Object> getInfo() {
                Map<String ,Object> map = new HashMap<>();
                map.put("code","401");
                map.put("info","系统故障，请稍后重试");
                return map;
            }
        };
    }
}
