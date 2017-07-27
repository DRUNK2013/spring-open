package com.drunk.open.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableEurekaServer
public class App {
    public static void main(String[] args) {
        System.out.println("start to run eureka server......");
        SpringApplication.run(App.class, args);
    }
}