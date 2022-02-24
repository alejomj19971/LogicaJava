package com.company;

import java.util.Scanner;


public class Ejercicio6{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double radius,area,perimeter;
        System.out.println("Enter circle radius :" );
        radius=inputData.nextDouble();
        area=(Math.PI)*(Math.pow(radius,2));
        perimeter=(Math.PI)*2*radius;
        System.out.println("The circle area is : "+area+"   and the circle perimeter is : "+perimeter);



    }
}
