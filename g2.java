package com.company;

import java.util.Scanner;
public class g2{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        int number;
        System.out.println("Enter number:");
        number=inputData.nextInt();

        if (number%7 ==0) {
            System.out.println("it is seven multiple");

        }

        else{
            System.out.println("it is not seven multiple");
        }



    }
}