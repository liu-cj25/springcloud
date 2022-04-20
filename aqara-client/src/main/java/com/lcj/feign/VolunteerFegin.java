package com.lcj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 远程调用
 *
 * @author changjiang.liu
 * @date 2021/12/28 19:22
 */
@FeignClient(name = "volunteer-client",fallback = FenignImpl.class)
public interface VolunteerFegin {

    /**
     * 远程调用
     *
     * @return
     */
    @GetMapping("/testVolunteer")
    String getVolunteer();
}
