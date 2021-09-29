package com.company;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args){
        int row,column,i,j;
        int arr[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row as you want max 10");
        row=sc.nextInt();
        System.out.println("Enter the number of column as you want max 10");
        column=sc.nextInt();
        System.out.println("Enter " +(row*column)+ " array element ");
        for (i=0; i<row; i++){
            for (j=0; j<column; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println(" Array is  \n");
        PrintWriter writer=new PrintWriter(new OutputStreamWriter(System.out));

        for (i=0; i<row; i++){
            for (j=0; j<column; j++){
                writer.print(arr[i][j]+ " ");
            }
            writer.println();

        }
        writer.flush();
        writer.close();




    }
}
