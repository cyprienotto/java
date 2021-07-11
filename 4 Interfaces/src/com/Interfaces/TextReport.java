package com.Interfaces;

public class TextReport {

    private TaxCalculator calculator;
    // USING an object =/= CREATING  an object,
    // instead we use Constructor injection
    // private TaxCalculator calculator;

    public TextReport(TaxCalculator calculator) {
        // Constructor injection
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

}
