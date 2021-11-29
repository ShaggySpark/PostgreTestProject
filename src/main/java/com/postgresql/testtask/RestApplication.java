package com.postgresql.testtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RestApplication {



    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

/*    @Bean
    CommandLineRunner init () {
        return args -> {

        };
    }*/
}