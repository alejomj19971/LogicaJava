package com.company;

import java.util.Scanner;
public class alreves2{

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int number;
        String invertednumber;
        System.out.println("Enter a number :");
        number=inputData.nextInt();

        invertednumber="";

        while(number>10){

           invertednumber=(invertednumber+(number%10));
            number=number/10;


        }

        System.out.println("The inverted number is : "+invertednumber+number);
    }
}