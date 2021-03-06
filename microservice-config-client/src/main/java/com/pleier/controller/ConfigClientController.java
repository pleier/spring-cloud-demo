package com.pleier.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :
 */
@RestController
public class ConfigClientController {

  /**
   * ${配置文件中的属性}
   */
  @Value("${profile}")
  private String profile;

  @GetMapping("/profile")
  public String hello() {
    return this.profile;
  }
}
