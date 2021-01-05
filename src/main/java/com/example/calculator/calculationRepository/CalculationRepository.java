package com.example.calculator.calculationRepository;

import com.example.calculator.entity.Calculation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CalculationRepository extends MongoRepository<Calculation, String> {
    //List<Calculation> findAllAsList(Pageable pageable);
}
