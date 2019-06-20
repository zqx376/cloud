/*
 * Project: microservice
 * File: Student.java
 * Created on 2019/6/11 10:29 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_student")
@Getter
@Setter
//@Accessors(chain = true)//链式，即每一个set方法都有return student
public class Student implements Serializable {//对象必须序列化才能传输  https://www.iteye.com/problems/93956

    @Id//主键
    @GeneratedValue//主键生成策略
    private Integer id;

    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private Integer grade;

}
