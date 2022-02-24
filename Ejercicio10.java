package com.company;

import java.util.Scanner;
public class Ejercicio10{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double sideA,sideB,sideC,area,semiperimeter,perimeter;
        System.out.println("Enter side A :");
        sideA=inputData.nextDouble();
        System.out.println("Enter side B (height)");
        sideB= inputData.nextDouble();
        System.out.println("Enter side C");
        sideC=inputData.nextDouble();
        perimeter=sideA+sideB+sideC;
        semiperimeter=perimeter/2;
        area= (sideA*sideB)/2;
        System.out.println("The triangle area is : "+area+"  its semiperimeter is : "+semiperimeter+" and the perimeter is : "+perimeter);




    }
}
