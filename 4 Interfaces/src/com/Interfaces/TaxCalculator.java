package com.Interfaces;

public class TaxCalculator extends Object implements ITaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    // telling to java this is an implementations methods of the interface
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
