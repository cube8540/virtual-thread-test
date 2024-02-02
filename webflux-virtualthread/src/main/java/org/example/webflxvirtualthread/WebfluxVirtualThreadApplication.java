package org.example.webflxvirtualthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class WebfluxVirtualThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxVirtualThreadApplication.class, args);
    }
}