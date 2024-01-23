package com.example.testsonarqubepranalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSonarQubePrAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSonarQubePrAnalysisApplication.class, args);
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        int i = 0;
        do {
            System.out.println("Hello World!");
            i++;
        } while (i < 10);
    }

}
