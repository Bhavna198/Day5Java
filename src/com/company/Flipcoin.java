package com.company;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin");
        int number = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i <= number; i++) {
            Random r = new Random();
            int n = r.nextInt(2);
            if (n < 1) {
                x++;
            }
            else {
                y++;
            }
        }
        double p;
        int total = x + y;
        if (x > y) {
            p = (x / total) * 100;
            System.out.println("Head wins");
            System.out.println(" Head wins by "  +p+  " percentage ");
        }
        else {
            p = (y / total) * 100;
            System.out.println("Tail wins");
            System.out.println(" Tail wins by " + p + " percentage ");
        }

    }
}
