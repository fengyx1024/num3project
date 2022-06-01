package com.shangma.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 9:31
 */
@Configuration
@MapperScan(basePackages = "com.shangma.mapper")
public class MybatisPlusConfig {


    /**
     *
     * @return mybatis-plus 分页插件
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        return new PaginationInnerInterceptor();
    }

    /**
     *
     * @return 将分页插件添加到拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}
