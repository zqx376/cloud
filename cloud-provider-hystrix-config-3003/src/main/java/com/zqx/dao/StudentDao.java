/*
 * Project: microservice
 * File: StudentDao.java
 * Created on 2019/6/11 15:28 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.dao;

import com.zqx.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * 假设要实现复杂查询就还要继承JpaSpecificationExecutor
 *
 * 这边到底要不要写 @Repository   ?????? 暂时不写是可以使用的
 */
public interface StudentDao extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {
}
