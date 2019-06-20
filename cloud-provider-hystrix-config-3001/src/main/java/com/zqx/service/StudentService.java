/*
 * Project: microservice
 * File: StudentService.java
 * Created on 2019/6/11 15:32 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.service;

import com.zqx.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public void save(Student student);

    public Student findById(Integer id);

    public List<Student> list();

    public void delete(Integer id);

    public Map<String,Object> getInfo();
}
