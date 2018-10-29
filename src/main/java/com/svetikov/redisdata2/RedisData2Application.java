package com.svetikov.redisdata2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@SpringBootApplication
public class RedisData2Application {

//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory() {
//        JedisConnectionFactory jedisConnectionFactory=new JedisConnectionFactory();
//
//        return jedisConnectionFactory;
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        final RedisTemplate<String,  Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
//        return template;
//    }

    public static void main(String[] args) {
        SpringApplication.run(RedisData2Application.class, args);
    }
}
