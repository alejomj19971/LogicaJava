package com.company;

import java.util.Scanner;
public class Ejercicio4{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double negative;
        System.out.println("Enter a negative number : ");
        negative=inputData.nextDouble();
        System.out.println("The negative number is : "+negative+" and its positive is : "+(-negative));



    }
}
