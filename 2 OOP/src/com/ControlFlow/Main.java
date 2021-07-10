package com.ControlFlow;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        employee.calculateWage();

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
// 2. Abstraction : Reduce complexity by hiding unnecessary details in class.
// ( ex : Classic tv remote control VS Apple tv remote control )
// 3. Coupling : level of dependency between classes.
// Delete unused methode, because each method is a point of coupling.
// ( ex : using constantly a smartphone, the more app is installed the more the smartphone is used )
// Consequence on impact of change = if class A use class B, B is modified - A must to be modified too.