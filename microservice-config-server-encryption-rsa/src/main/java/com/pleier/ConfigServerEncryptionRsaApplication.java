package com.pleier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author : pleier
 * @date : 2018/6/20
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerEncryptionRsaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEncryptionRsaApplication.class,args);
    }
}
