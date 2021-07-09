package com.ControlFlow;

public class Employee {
    // template  Fields
    private int baseSalary;
    private int extrHours;
    private int hourlyRate;

    // blueprint  methods
    public int calculateWage() {
        return baseSalary + (extrHours * hourlyRate);
    }
    public void setExtrHours( int extrHours) {
        if(extrHours <= 0)
            throw new IllegalArgumentException("extrHours is not négative");
        this.extrHours = extrHours;
    }
    public void setHourlyRate( int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("hourlyRate is not négative");
        this.hourlyRate = hourlyRate;
    }
    public void setBaseSalary( int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("salary is not négative");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return this.baseSalary;
    }
}
