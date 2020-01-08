package com.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.mall.demo.mbg.mapper","com.mall.demo.dao"})
public class MyBaitsConfig {
}