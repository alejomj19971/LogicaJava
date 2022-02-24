package com.company;

import java.util.Scanner;
public class  Ejercicio2{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double A,B,sum,subtraction,multiplication,division;
        System.out.println("Enter number (A) : ");
        A=inputData.nextDouble();
        System.out.println("Enter number (B) : ");
        B=inputData.nextDouble();
       sum=A+B;
       subtraction=A-B;
       multiplication=A*B;
       division=A/B;
       System.out.println("The result of A+B is :"+sum);
       System.out.println("The result of A-B is :"+subtraction);
       System.out.println("The result of A*B is :"+multiplication);
       System.out.println("The result of A/B is :"+division);




    }
}
