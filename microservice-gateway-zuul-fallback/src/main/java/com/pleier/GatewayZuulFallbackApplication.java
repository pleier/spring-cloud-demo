package com.pleier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 回退
 *
 * @author : pleier
 * @date : 2018/6/19
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulFallbackApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulFallbackApplication.class,args);
    }
}
