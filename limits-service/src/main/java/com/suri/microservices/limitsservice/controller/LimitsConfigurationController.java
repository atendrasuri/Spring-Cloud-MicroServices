package com.suri.microservices.limitsservice.controller;

import com.suri.microservices.limitsservice.bean.Configuration;
import com.suri.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: atekumar
 * @Current-Version: 1.0.0
 * @Creation-Date: 31/08/19
 * @Description: (Overwrite)
 * 1. Please describe the business usage of the class.
 * 2. Please describe the technical usage of the class.
 * @History:
 */
@RefreshScope
@RestController
public class LimitsConfigurationController {

  @Autowired
  Configuration configuration;

  @Value("${limits-service.minimum}")
  private Integer minimum;

  @Value("${limits-service.maximum}")
  private Integer maximum;

  @GetMapping("/limits")
  public LimitConfiguration retriveLimitsFromConfiguration() {
    return new LimitConfiguration(minimum, maximum);
  }
}