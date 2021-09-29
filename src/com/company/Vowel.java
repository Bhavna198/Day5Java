package com.company;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char al=sc.next().charAt(0);
        if ( al == 'A' || al == 'E' || al == 'I' || al == 'O' || al == 'U' || al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u' )
        {
            System.out.println( al+ " Alphabet is vowel ");
        }
        else {
            System.out.println( al+ " Alphabet is Consonent ");
        }
    }
}
