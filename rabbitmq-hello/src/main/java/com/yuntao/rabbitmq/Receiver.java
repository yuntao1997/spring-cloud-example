package com.yuntao.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author yuntao.zhou
 * @version 1.0
 * @create 2018-11-13 16:53
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {


    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver :" + msg);
    }
}
