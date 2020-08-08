package com.example.springjmstemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringJmsTemplateApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringJmsTemplateApplication.class, args);

    }

}
