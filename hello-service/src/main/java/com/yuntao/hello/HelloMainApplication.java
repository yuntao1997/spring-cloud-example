package com.yuntao.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ${DESCRIPTION}
 *
 * @author YunTao.Zhou
 * @CreateTime 2018/11/11 15:56
 * @ModifyUser YunTao.Zhou
 * @ModifiedTime 2018/11/11 15:56
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class HelloMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloMainApplication.class,args);
    }
}
