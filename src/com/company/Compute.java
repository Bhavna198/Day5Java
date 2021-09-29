package com.company;

import java.util.Scanner;

public class Compute {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int dividend= sc.nextInt();
        Scanner sce= new Scanner(System.in);
        System.out.println("Enter the Divisor");
        int divisor= sce.nextInt();
        int quotient=dividend/divisor;
        int remain=dividend%divisor;
        System.out.println(" The quotient of " +dividend+ " / " +divisor+ " is " +quotient );
        System.out.println(" The remainder of " +dividend+ " % " +divisor+ " is " +remain );



    }
}
