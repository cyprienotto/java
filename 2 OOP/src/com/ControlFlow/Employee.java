package com.ControlFlow;

public class Employee {
    // template  Fields
    public int baseSalary;
    public int extrHours;
    public int hourlyRate;

    // blueprint  methods
    public int calculateWage() {
        return baseSalary + (extrHours * hourlyRate);
    }
}
