package com.onurilyastokay.unittestexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestExampleApp {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestExampleApp.class, args);
        System.out.println("------------- INFLATION TOOL IS STARTED SUCCESSFULLY -------------");
    }
}
