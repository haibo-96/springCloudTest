package com.haibo.microservice.cloud.controller;

import com.haibo.microservice.cloud.service.DockerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/docker")
@Api(tags = "docker服务")
public class TestDocker {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DockerService dockerService;

    @ApiOperation("hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        logger.info("hello");

        return "hello";
    }
}
