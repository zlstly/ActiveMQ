package com.power.active.producer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    @JmsListener(destination = "sample.queue",containerFactory = "jmsListenerContainerQueue")
    public void receiveQueue(String text) {
        System.out.println("queue:"+text);
    }
    

}
