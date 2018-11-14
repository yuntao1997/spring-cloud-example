package com.yuntao.feign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author yuntao.zhou
 * @version 1.0
 * @create 2018-11-12 14:56
 */
@FeignClient("HELLO-SERVICE")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();


    @RequestMapping("/trace")
    String trace();
}
