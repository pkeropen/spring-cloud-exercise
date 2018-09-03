package com.vita.rmq.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "vita")
public class Receiver {

    /**
     * 接收信息
     * @param msg
     */
    @RabbitHandler
    public void process(String msg){
        System.out.println("Receiver : " + msg);
    }

}
