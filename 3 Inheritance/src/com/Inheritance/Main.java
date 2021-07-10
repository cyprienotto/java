package com.Inheritance;

// Inheritance for reuse code
// We declare all common behaviour in a single class( base/super/parent class), other class (sub/child class)
public class Main {

    public static void main(String[] args) {
        // var uicontrol = new UIControl();
    }

    public static void show(UIControl control) {
        if(control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello Upcasting Downcasting");
        }
        System.out.println(control);
    }
}
