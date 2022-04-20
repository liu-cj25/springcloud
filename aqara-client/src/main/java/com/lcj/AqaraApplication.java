package com.lcj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * aqara
 *
 * @author changjiang.liu
 * @date 2021/12/28 19:07
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class AqaraApplication {
    public static void main(String[] args) {
        SpringApplication.run(AqaraApplication.class,args);
    }
}
