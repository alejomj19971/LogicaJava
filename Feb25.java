package com.company;

import java.util.Scanner;
public class Feb25{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
    int number;
        System.out.println("Enter number:");
    number=inputData.nextInt();

        if (number%2!=0) {
            System.out.println("it is not pair");

        }

        else{
            System.out.println("it is  pair");
        }



    }
}