package com.haibo.microservice.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "websocket测试")
@RestController
@RequestMapping("/websocket")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ApiOperation("hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test(){
        logger.info("hello");
        return "hello,world";
    }
}
