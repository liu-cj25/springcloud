package com.lcj.feign;

import org.springframework.stereotype.Component;

/**
 * s
 *
 * @author changjiang.liu
 * @date 2022/3/30 9:40
 */
@Component
public class FenignImpl implements VolunteerFegin{
    @Override
    public String getVolunteer() {
        System.out.println("熔断！");
        return "出发熔断";
    }
}
