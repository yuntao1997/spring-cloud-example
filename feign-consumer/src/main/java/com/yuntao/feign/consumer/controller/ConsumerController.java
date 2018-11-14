package com.yuntao.feign.consumer.controller;

import com.yuntao.feign.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author YunTao.Zhou
 * @CreateTime 2018/11/11 16:36
 * @ModifyUser YunTao.Zhou
 * @ModifiedTime 2018/11/11 16:36
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/feign-consumer/hello")
    public String helloConsumer() {
        return helloService.hello();
    }

    @GetMapping("/feign-consumer/trace")
    public String traceConsumer() {
        return helloService.trace();
    }
}
