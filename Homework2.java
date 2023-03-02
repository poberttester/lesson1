package com.company;

import java.util.ArrayList;
import java.util.List;

// Вывести все простые числа от 1 до 1000
public class Homework2 {

    public void simpleNumbers(){

        int length = 1000;
        List<Integer> simple = new ArrayList<>();

        for (int i = 2; i <= length; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && j != i) break;
                if (i % j == 0 && j == i) System.out.print(i + " ");
            }
        }

        System.out.println("\n");

    }
}
