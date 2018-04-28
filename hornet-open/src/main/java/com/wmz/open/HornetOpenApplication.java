package com.wmz.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wmz
 */
@EnableEurekaClient
@SpringBootApplication
public class HornetOpenApplication {

    public static void main(String[] args) {
        SpringApplication.run(HornetOpenApplication.class, args);
    }
}
