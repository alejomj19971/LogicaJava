package com.company;

import java.util.Scanner;
public class alreves{

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int number,primernumero;
        System.out.println("Enter a number :");
        number=inputData.nextInt();

        while(number>10){
            primernumero=number%10;
            System.out.println(primernumero);
            number=number/10;


        }
        System.out.println(number);

    }
}