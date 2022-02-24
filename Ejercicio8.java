package com.company;

import java.util.Scanner;
public class Ejercicio8{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
    double triangleside,perimeter,height,area;
        System.out.println("Enter triangle side  : ");
        triangleside=inputData.nextDouble();
        perimeter= triangleside*3;
        height=triangleside*((Math.pow(3,(0.5)))/2);
        area=(triangleside*height)/2;

        System.out.println("The triangle height is : "+height);
        System.out.println("The perimeter is : "+perimeter);
        System.out.println("The triangle area is  : "+area);




    }
}
