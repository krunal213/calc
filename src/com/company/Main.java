package com.company;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
        int reuslt = calculator.getResult(new Addition(1,2));
        System.out.println("Addition is  : "+reuslt);
    }
}
