package com.company;

public class Addition implements Operation {

    private final int input1;
    private final int input2;

    public Addition(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    @Override
    public int getResult() {
        return input1 + input2;
    }
}
