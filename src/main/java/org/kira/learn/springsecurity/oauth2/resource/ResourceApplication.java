package org.kira.learn.springsecurity.oauth2.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.session.data.redis.RedisIndexedSessionRepository;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/8/30 23:40
 */
@SpringBootApplication
@EnableOAuth2Sso
@EnableRedisHttpSession(redisNamespace = RedisIndexedSessionRepository.DEFAULT_NAMESPACE + ":${spring.application.name}")
public class ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }
}