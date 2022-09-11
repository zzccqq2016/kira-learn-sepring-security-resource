//package org.kira.learn.springsecurity.oauth2.resource.config;
//
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
//
//import java.security.KeyPair;
//
///**
// * @author: Zhang Chaoqing
// * Date: 2022/8/30 23:42
// */
//@Configuration
//@EnableOAuth2Sso
//@EnableResourceServer //标识为资源服务
//@EnableWebSecurity(debug = true)
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
//public class KiraResourceServerConfig extends ResourceServerConfigurerAdapter {
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
////        resources
////                .tokenServices(tokenServices());
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest()
//                .permitAll();
//
//        http.csrf().disable();
//    }
//
////    /**
////     * @Description OAuth2 token持久化接口，jwt不会做持久化处理
////     * @Date 2019/7/15 18:12
////     * @Version 1.0
////     */
////    @Bean
////    public TokenStore jwtTokenStore() {
////        return new JwtTokenStore(accessTokenConverter());
////    }
////
////    /**
////     * @Description 令牌服务
////     * @Date 2019/7/15 18:07
////     * @Version 1.0
////     */
////    @Bean
////    public DefaultTokenServices tokenServices() {
////        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
////        defaultTokenServices.setTokenStore(jwtTokenStore());
////        return defaultTokenServices;
////    }
////
////    /**
////     * @Description 自定义token令牌增强器
////     * @Date 2019/7/11 16:22
////     * @Version 1.0
////     */
////    @Bean
////    public JwtAccessTokenConverter accessTokenConverter() {
////        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
////        KeyPair keyPair = new KeyStoreKeyFactory(
////                new ClassPathResource("kira-jwt.jks"), "Zhangxu00!".toCharArray()).getKeyPair("kira");
////        converter.setKeyPair(keyPair);
////        return converter;
////    }
//
//
//    public KiraResourceServerConfig() {
//        super();
//    }
//
//
//}