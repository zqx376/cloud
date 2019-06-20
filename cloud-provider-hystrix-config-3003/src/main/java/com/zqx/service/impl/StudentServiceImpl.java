/*
 * Project: microservice
 * File: StudentServiceImpl.java
 * Created on 2019/6/11 15:38 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.service.impl;

import com.zqx.dao.StudentDao;
import com.zqx.entity.Student;
import com.zqx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Service是写在实现类上的，因为@Service是吧spring容器中的bean进行实例化，也就等同于new操作，只有实现类可以进行实例化
 *
 * @Service注解、@Controller注解以及@Repository注解都是Spring中的注解，
 * 加上这些注解的目的是可以区分JavaEE三层架构中的三个不同层次，其目的都是控制反转，将Java对象交给Spring容器创建。@Service注解是标注在实现类上的。
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void save(Student student){
        studentDao.save(student);
    }

    @Override
    public Student findById(Integer id){
        return studentDao.findOne(id);
    }
    @Override
    public List<Student> list(){
        return studentDao.findAll();
    }
    @Override
    public void delete(Integer id){
        studentDao.delete(id);
    }
    @Override
    public Map<String,Object> getInfo(){
        Map<String ,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("info","业务数据XXXXXXXXX3003");//正常返回数据
        return map;
    }
}
