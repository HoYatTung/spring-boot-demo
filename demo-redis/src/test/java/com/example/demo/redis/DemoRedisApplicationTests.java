package com.example.demo.redis;

import com.example.demo.redis.util.RedisUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoRedisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;
    @Test
    void contextLoads() {

    }

}
