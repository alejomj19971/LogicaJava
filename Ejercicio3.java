package com.company;
import java.math.*;
import java.util.Scanner;
public class Ejercicio3{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double square,cube,number;
        System.out.println("Enter number : ");
        number= inputData.nextDouble();
        square=  Math.pow(number,2) ;
        cube= Math.pow(number,3);
        System.out.println("The number square is : "+square);
        System.out.println("The number cube is   : "+cube);





    }
}
