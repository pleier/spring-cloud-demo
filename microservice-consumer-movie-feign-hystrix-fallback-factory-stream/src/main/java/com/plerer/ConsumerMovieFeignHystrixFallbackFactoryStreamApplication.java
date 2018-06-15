package com.plerer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class ConsumerMovieFeignHystrixFallbackFactoryStreamApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerMovieFeignHystrixFallbackFactoryStreamApplication.class, args);
  }
}
