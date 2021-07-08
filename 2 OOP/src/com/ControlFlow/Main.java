package com.ControlFlow;

public class Main {
    public static void main(String[] args) {

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setExtrHours(10);
        employee.setHourlyRate(20);

        int wage = employee.calculateWage();

        System.out.println(wage);
    }
    // Encapsulation in Employee class
    // public static int calculateWage(
    //      int baseSalary,
    //      int extrHours,
    //      int hourlyRate
    // ) {
    //  return baseSalary + (extrHours * hourlyRate);
    // }
}


// Class is a blueprint/template for creating object (  instance of the class )
// Class have fields & methods
// procedural programming very bad for maintenance, scability =/= O.O.P.

// OOP :
// 1. Encapsulation : Bundle the data & methods that operate on the data in a single unit