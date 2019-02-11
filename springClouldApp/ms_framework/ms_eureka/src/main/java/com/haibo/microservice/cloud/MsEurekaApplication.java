package com.haibo.microservice.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
@ComponentScan(basePackages = "com.haibo.microservice.cloud")
public class MsEurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(MsEurekaApplication.class, args);
    }
}
