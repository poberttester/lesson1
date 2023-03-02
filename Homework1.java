package com.company;

import java.util.Scanner;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class Homework1 {

    public void numbers(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = reader.nextInt();
        reader.close();

        int summ = 0;
        for (int i = 0; i <= n; i++) {
            summ = summ + i;
        }

        int productOf = 1;
        for (int i = 1; i <= n; i++) {
            productOf = productOf * i;
        }

        System.out.println("Cумма чисел: " + summ + '\n' + "Произведение чисел: " + productOf + '\n');

    }
}
