package com.yuntao.ribbon.controller;

import com.yuntao.ribbon.service.HelloService;
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

    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }
}
