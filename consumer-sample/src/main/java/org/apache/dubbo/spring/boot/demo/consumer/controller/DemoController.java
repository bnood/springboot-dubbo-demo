package org.apache.dubbo.spring.boot.demo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.spring.boot.demo.consumer.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Beke
 * @Date 2019\4\25 0025
 * @Time 17:37
 */
@RestController
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping
    public String index() {
        return this.demoService.sayHello("guangzhou");
    }
}
