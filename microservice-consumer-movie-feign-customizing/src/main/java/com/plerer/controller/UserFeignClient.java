package com.plerer.controller;

import com.config.FeignConfiguration;
import com.plerer.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
