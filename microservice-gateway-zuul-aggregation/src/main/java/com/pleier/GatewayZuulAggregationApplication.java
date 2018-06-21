package com.pleier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *  聚合微服务
 *
 * @author : pleier
 * @date : 2018/6/19
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulAggregationApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulAggregationApplication.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
