package com.wmz.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wmz
 */
@EnableEurekaServer
@SpringBootApplication
public class HornetManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HornetManagerApplication.class, args);
    }
}
