package com.example.calculator.entity;

import org.springframework.data.annotation.Id;

public class Calculation {

    @Id
    public String id;
    private float a;
    private float b;
    private float result;
    private String operationUsed;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getOperationUsed() {
        return operationUsed;
    }

    public void setOperationUsed(String operationUsed) {
        this.operationUsed = operationUsed;
    }
}
