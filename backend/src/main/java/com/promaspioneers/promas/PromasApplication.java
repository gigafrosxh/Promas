package com.promaspioneers.promas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromasApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromasApplication.class, args);
        System.out.println("PromasApplication started");
    }

}
