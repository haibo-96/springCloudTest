package com.haibo.microservice.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
@EnableDiscoveryClient
public class MsZuulApplication {
    public static void main(String[] args){
        SpringApplication.run(MsZuulApplication.class,args);
    }
}
