package com.example.springjmstemplate.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${springjms.myQueue}")
    String queue;

    public void send(String message) {

        MessageCreator mc = s -> s.createTextMessage(message);

        //if it is set to true it means it is a topic instead of a queue
        //jmsTemplate.setPubSubDomain(true);

        jmsTemplate.send(queue, mc);

    }

}
