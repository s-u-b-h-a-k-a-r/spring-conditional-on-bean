package com.subhakar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConditionalOnBeanApp implements CommandLineRunner {
    private SpringService springService;

    @Autowired
    public SpringConditionalOnBeanApp(SpringService springService) {
        this.springService = springService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringConditionalOnBeanApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Spring service fully qualified class name: " + springService.getClass());
    }
}
