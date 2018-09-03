package com.vita.rmq.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送者
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sned(){
        String context = "hello" + new Date();
        System.out.println("Sender:" + context);
        this.amqpTemplate.convertAndSend("vita",context);
    }

}
