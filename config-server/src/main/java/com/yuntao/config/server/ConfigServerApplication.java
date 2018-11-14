package com.yuntao.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ${DESCRIPTION}
 *
 * @author yuntao.zhou
 * @version 1.0
 * @create 2018-11-13 16:09
 */
@EnableConfigServer
@SpringCloudApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
