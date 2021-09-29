package com.company;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Value Of a");
            double a = sc.nextDouble();
            System.out.println("Enter The Value Of b");
            double b = sc.nextDouble();
            System.out.println("Enter The Value Of c");
            double c = sc.nextDouble();
            double Root1 = 0;
            double Root2 = 0;

            double delta = (b * b) - (4 * a * c);
            if (delta > 0) {
                Root1 = (-b + Math.sqrt(delta)) / (2 * a);
                Root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Roots Are : " + Root1 + " and " + Root2);
            } else if (delta == 0) {
                Root1 = (-b / (2 * a));
                Root2 = (-b / (2 * a));
                System.out.println("Roots Are : " + Root1 + " and " + Root2);
            } else {
                System.out.println("Roots Are Complex ");
            }

        }
    }


