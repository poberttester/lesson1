package com.company;

import java.util.*;
// Реализовать простой калькулятор (+ - / *)

public class Homework3 {

    public void calculator() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = reader.nextInt();

        System.out.print('\n' + "Enter arithmetic symbol: ");
        String symbol = reader.next();

        System.out.print('\n' + "Enter second numbers: ");
        int second = reader.nextInt();

        reader.close();


        int result = 0;
        switch (symbol){
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            default:
                System.out.printf("You have entered wrong operator! ");
        }

        System.out.println("Result is: " + result + "\n");

    }
}
