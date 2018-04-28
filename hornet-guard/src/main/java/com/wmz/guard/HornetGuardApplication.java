package com.wmz.guard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wmz
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class HornetGuardApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HornetGuardApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
