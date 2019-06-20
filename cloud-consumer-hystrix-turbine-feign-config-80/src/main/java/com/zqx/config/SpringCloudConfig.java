/*
 * Project: microservice
 * File: SpringCloudConfig.java
 * Created on 2019/6/11 17:30 by user
 * 版本 修改时间 作者 修改内容
 * V1.0.1 2019/6/11 user 初始版本
 *
 * Copyright (c) 2015 无锡和睿信息系统有限公司 版权所有
 * WUXI HEURISTIC INFORMATION TECHNOLOGY CO.,LTD. All Rights Reserved.
 */
package com.zqx.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * SpringCloud的相关配置
 */
@Configuration
public class SpringCloudConfig {
    /**自定义轮询算法
     * 就是比如某个服务挂了，会尝试调用几次，实在不行就不调用了；可能过段时间还会再试探
     * @return
     */
    public IRule myRule(){
        return new RandomRule();
    }
}
