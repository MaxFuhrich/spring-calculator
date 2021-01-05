package com.example.calculator;

import com.example.calculator.CalculationRepository.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication//seems to work without(exclude = {MongoDataAutoConfiguration.class, MongoAutoConfiguration.class})
public class CalculatorApplication{ //Commented out to find the fault implements CommandLineRunner {

    @Autowired
    CalculationRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
    }*/
}
