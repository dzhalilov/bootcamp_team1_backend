package com.redmadrobot.watermelonsapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping
    public @ResponseBody String hello(){
        log.info("Hello page");
        return "This is a hello page for Watermelons application";
    }
}
