package com.company;

import java.util.Scanner;

public class AddZero {
    public void distinctTriplets(int arr[], int sum ,int n){
        int count=0;
        for (int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; j<n; j++){
                    if (arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+ " " +arr[j]+ " " +arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("The number of triplets are "+count);
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the number max 5");
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int n= arr.length;
        AddZero a=new AddZero();
        a.distinctTriplets(arr,sum,n);
    }
}
