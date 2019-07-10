package com.neuedu.his.getaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //表明本服务为路由服务
public class GetawayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetawayApplication.class,args);
    }
}