package com.Interfaces;
// We use Interfaces to build
// LOOSELY-COUPLED (- coupling), EXTENSIBLE, TESTABLE APPLICATIONS.
// INTERFACES defines what should be done. ex: Data Compression, Encryption, Sorting, Searching.
// VS CLASS defines how should be done.

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator(100_000);
        // injection of TaxCalculator to complete
        // Constructor injection
        var report = new TextReport(calculator);
    }
}
