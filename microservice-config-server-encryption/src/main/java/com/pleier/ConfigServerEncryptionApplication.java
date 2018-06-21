package com.pleier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 对称加密
 *
 * @author : pleier
 * @date : 2018/6/21
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerEncryptionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEncryptionApplication.class,args);
    }
}
