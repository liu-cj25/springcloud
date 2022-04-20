package com.lcj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 志愿者服务
 *
 * @author changjiang.liu
 * @date 2021/12/28 18:59
 */
@EnableDiscoveryClient
@SpringBootApplication
public class VolunteerApplication {
    public static void main(String[] args) {
        SpringApplication.run(VolunteerApplication.class,args);
    }
}
