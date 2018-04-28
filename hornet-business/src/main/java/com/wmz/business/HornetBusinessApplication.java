package com.wmz.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wmz
 */
@EnableEurekaClient
@SpringBootApplication
public class HornetBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(HornetBusinessApplication.class, args);
    }
}
