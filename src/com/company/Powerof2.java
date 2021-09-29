package com.company;

public class Powerof2 {

    public static void main(String[] args) {
        long a=1;
        for (int i=1; i<31; i++){
            a=a*2;
            System.out.println(i+ " th power of 2 is = " +a);
        }
    }
}
