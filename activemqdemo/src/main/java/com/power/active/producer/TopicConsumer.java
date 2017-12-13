package com.power.active.producer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer {

    
    @JmsListener(destination = "sample.topic",containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic(String text) {
        System.out.println("topic:"+text);
    }
   

}
