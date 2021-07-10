package com.Inheritance;

public class UIControl {
    private boolean isEnable = true;

    /*public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
    }*/

    public void render() {
        System.out.println("Parent Class");
    }
    public void enable() {
        isEnable = true;
    }
    public void disable() {
        isEnable = false;
    }

    // Getters to read the values
    public boolean isEnabled() {
        return this.isEnable;
    }
}
