package com.yuntao.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ${DESCRIPTION}
 *
 * @author YunTao.Zhou
 * @CreateTime 2018/11/11 15:56
 * @ModifyUser YunTao.Zhou
 * @ModifiedTime 2018/11/11 15:56
 * @Version 1.0
 */

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping(value = "/hello")
    public String index() {

        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            logger.info("/hello,host: {},service id: {}", discoveryClient.getInstances(service).stream().map(o -> o.getHost()).collect(Collectors.joining()),
                    service);

        }

        return "Hello World";
    }

}
