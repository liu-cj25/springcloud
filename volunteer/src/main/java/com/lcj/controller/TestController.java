package com.lcj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * testVolunteer
 *
 * @author changjiang.liu
 * @date 2021/12/28 19:10
 */
@RestController
public class TestController {

    @GetMapping("testVolunteer")
    public String test(){
        System.out.println("hello~~");
        return "hello volunteer";
    }
}
