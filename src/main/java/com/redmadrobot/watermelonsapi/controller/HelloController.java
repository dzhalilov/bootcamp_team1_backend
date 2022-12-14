package com.redmadrobot.watermelonsapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HelloController {


    @GetMapping
    public String hello() {
        log.info("Hello page");
        return "hello";
    }
}
