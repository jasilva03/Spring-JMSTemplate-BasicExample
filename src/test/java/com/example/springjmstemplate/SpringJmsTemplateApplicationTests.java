package com.example.springjmstemplate;

import com.example.springjmstemplate.sender.MessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJmsTemplateApplicationTests {

    @Autowired
    MessageSender messageSender;

    @Test
    void testSendAndReceive() {

        messageSender.send("Hello Spring JMS!!!!");

    }

}
