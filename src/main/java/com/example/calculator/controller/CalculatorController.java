package com.example.calculator.controller;

import com.example.calculator.calculationRepository.CalculationRepository;
import com.example.calculator.entity.Calculation;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/calculations/page")
    public List<Calculation> getPages(@RequestParam(required = false) Integer index){
        if (index == null){
            index = 0;
        }
        //Pageable penis = PageRequest.of(index, 1);
        Page<Calculation> calcPage = repository.findAll(PageRequest.of(index, 1));
        return calcPage.getContent();
    }
}
