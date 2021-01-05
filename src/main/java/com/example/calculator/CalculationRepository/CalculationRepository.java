package com.example.calculator.CalculationRepository;

import com.example.calculator.entity.Calculation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalculationRepository extends MongoRepository<Calculation, String> {
}
