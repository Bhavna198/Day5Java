package com.company;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class Distance {
    static void calculateDistance(double x, double y){
        Double distance=Math.sqrt(x*x+y*y);
        System.out.println("Distance of " +x+ " and " +y+ " is " +distance);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x value");
        double x= sc.nextDouble();
        System.out.println("Enter the y value");
        double y= sc.nextDouble();
        calculateDistance(x,y);
    }
}
