package com.power.active.producer;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    
    @Autowired
    private Queue queue;
    
    @Autowired
    private Topic topic;
    
    @RequestMapping("/sendMsg")
    public String send(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
        return "222";
    }
    
    @RequestMapping("/topicsendMsg")
    public String topicSend(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
        return "222";
    }
}
