package org.example;

public class Main {
    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        
        System.out.println(intsCalc.sum(10, 22));

        System.out.println(intsCalc.mult(10, 15));

        System.out.println(intsCalc.pow(2, 10));
    }
}