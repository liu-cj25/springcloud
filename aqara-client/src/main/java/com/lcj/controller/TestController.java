package com.lcj.controller;

import com.lcj.feign.VolunteerFegin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    protected static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private VolunteerFegin volunteerFegin;

    @GetMapping("testAqara")
    public String test() {
        return "hello testAqara";
    }

    @GetMapping("/feign")
    public String getVolunteer() {
        logger.info("fegin");
        System.out.println("开始调用volunteer的远程调用------");
        return volunteerFegin.getVolunteer();
    }
}
