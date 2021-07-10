package com.Inheritance;

public class TextBox extends UIControl {

    public TextBox(boolean isEnable) {
        // Call the Constructor of the Super Class UIControl
        // with super()
        super(isEnable);
    }

    private String text = "";
    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        this.text = "";
    }
    // Override =/= Overloading.
    // Override toString() from Object Class
    @Override
    public String toString() {
        return this.text;
    }
}
