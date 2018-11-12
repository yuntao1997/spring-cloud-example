package com.yuntao.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ${DESCRIPTION}
 *
 * @author yuntao.zhou
 * @version 1.0
 * @create 2018-11-12 15:33
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboradApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboradApplication.class, args);

    }

}
