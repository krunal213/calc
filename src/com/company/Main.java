package com.company;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
        System.out.println("Addition is  : "+calculator.getResult(new Addition(1,2)));
    }
}
