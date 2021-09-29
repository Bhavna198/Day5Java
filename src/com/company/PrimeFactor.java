package com.company;

import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the prime factors");
        int number = sc.nextInt();
        int a = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                a = 1;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        a = 0;
                        break;
                    }

                }
                if (a == 1) {
                    System.out.println("Prime factor is " + i);

                }

            }
        }
    }
}
