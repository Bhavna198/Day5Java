package com.company;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year>=1000 && year<=9999){
            if (((year % 4==0) && (year%100!=0 )) || (year%400==0)){
                System.out.println(+year+ " is leap year ");
            }
            else {
                System.out.println(+year+ " is not leap year ");
            }
        }
        else {
            System.out.println("This is not a 4 digit year");
        }


    }

}
