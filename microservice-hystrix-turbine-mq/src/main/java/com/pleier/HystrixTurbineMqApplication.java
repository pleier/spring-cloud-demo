package com.pleier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @author : pleier
 * @date : 2018/6/15
 */
@EnableTurbineStream
@SpringBootApplication
public class HystrixTurbineMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineMqApplication.class,args);
    }
}
