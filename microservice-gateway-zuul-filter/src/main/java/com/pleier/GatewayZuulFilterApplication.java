package com.pleier;

import com.pleier.filter.PreRequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 简单微服务网关
 *
 * @author : pleier
 * @date : 2018/6/19
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulFilterApplication {

    @Bean
    public PreRequestLogFilter preRequestLogFilter(){
        return new PreRequestLogFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulFilterApplication.class,args);
    }
}
