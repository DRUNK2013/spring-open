package com.drunk.open.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class App {
    public static void main(String[] args) {
        System.out.println("start config server.................");
        SpringApplication.run(App.class, args);
    }
}
