package com.example.calculator.controller;

import com.example.calculator.CalculationRepository.CalculationRepository;
import com.example.calculator.entity.Calculation;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@RestController
public class CalculatorController {

    @Autowired
    CalculationRepository repository;

    @PostMapping("/add")
    public Calculation add(@RequestBody Calculation calc){
        CalculatorService.add(calc); //ohne neue zuweisung?
        repository.save(calc);
        return calc;
    }

    @PostMapping("/sub")
    public Calculation sub(@RequestBody Calculation calc){
        CalculatorService.sub(calc);
        repository.save(calc);
        return calc;
    }

    @PostMapping("/mult")
    public Calculation mult(@RequestBody Calculation calc){
        CalculatorService.mult(calc);
        repository.save(calc);
        return calc;
    }

    @PostMapping("/div")
    public Calculation div(@RequestBody Calculation calc){
        CalculatorService.div(calc);
        repository.save(calc);
        return  calc;
    }

    @GetMapping("/history")
    public List<Calculation> getAll(){
        //repository.find
        return repository.findAll();
    }
}
