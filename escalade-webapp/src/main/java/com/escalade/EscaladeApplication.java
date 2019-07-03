package com.escalade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EscaladeApplication {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EscaladeApplication.class);
    }

    public static void main(String[] args){
        SpringApplication.run(EscaladeApplication.class, args);
    }
}
