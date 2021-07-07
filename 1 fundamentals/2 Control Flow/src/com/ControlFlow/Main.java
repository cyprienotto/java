package com.ControlFlow;

public class Main {

    public static void main(String[] args) {
        int temperature = 30;
        int desert = 40;
        boolean  isHot = temperature < desert;
        String temperature_hot_or_no = isHot ? "Il fait très chaud !" : "Il ne fait pas chaud.";
    }
}
