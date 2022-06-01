package com.shangma;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/5/31 22:54
 */
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate template;

    @Test
    void testConn() {
        ValueOperations<String, String> operations = template.opsForValue();

        operations.set("hello","world");

        String hello = operations.get("hello");
        System.out.println(hello);
    }
}
