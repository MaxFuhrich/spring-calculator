package com.example.calculator.service;

import com.example.calculator.entity.Calculation;

public class CalculatorService {

    public static Calculation add(Calculation calc) {
        calc.setResult(calc.getA() + calc.getB());
        calc.setOperationUsed(String.format("%.3f + %.3f = %.3f", calc.getA(), calc.getB(), calc.getResult()));
        return calc;
    }

    public static Calculation sub(Calculation calc) {
        calc.setResult(calc.getA() - calc.getB());
        calc.setOperationUsed(String.format("%.3f - %.3f = %.3f", calc.getA(), calc.getB(), calc.getResult()));
        return calc;
    }

    public static Calculation mult(Calculation calc) {
        calc.setResult(calc.getA() * calc.getB());
        calc.setOperationUsed(String.format("%.3f * %.3f = %.3f", calc.getA(), calc.getB(), calc.getResult()));
        return calc;
    }

    public static Calculation div(Calculation calc) {
        calc.setResult(calc.getA() / calc.getB());
        calc.setOperationUsed(String.format("%.3f / %.3f = %.3f", calc.getA(), calc.getB(), calc.getResult()));
        return calc;
    }
}
