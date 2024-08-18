package com.company;

public class Substraction implements Operation {

    private final int number1;
    private final int number2;

    public Substraction(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int getResult() {
        return number1 + number2;
    }
}
