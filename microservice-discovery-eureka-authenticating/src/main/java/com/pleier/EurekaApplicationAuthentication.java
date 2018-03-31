package com.pleier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationAuthentication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationAuthentication.class,args);
    }
}
