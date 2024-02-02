package org.example.webfluxr2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class WebfluxR2dbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxR2dbcApplication.class, args);
    }
}
