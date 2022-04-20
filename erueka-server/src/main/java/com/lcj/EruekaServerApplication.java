package com.lcj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 *
 * @author changjiang.liu
 * @date 2021/12/28 18:03
 */
@EnableEurekaServer
@SpringBootApplication
public class EruekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EruekaServerApplication.class, args);
    }
}
