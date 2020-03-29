package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

/**
 * @program: AutoTest
 * @author: Domi
 * @create: 2020-03-26 00:36
 **/
@EnableScheduling
@SpringBootApplication
public class Application {
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class,args);
    }

    @PreDestroy
    public void close() {
        Application.context.close();
    }
}
