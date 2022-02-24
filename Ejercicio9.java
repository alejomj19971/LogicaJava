package com.company;

import java.util.Scanner;
public class Ejercicio9{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
// Ax+By+C=0  ,  y-y1= mx -mx1
        double x1,y1,x2,y2,m,b,A,B,C;
        System.out.println("Enter x1:");
        x1=inputData.nextInt();

        System.out.println("Enter y1:");
        y1=inputData.nextInt();

        System.out.println("Enter x2:");
        x2=inputData.nextInt();

        System.out.println("Enter y2:");
        y2=inputData.nextInt();
        m=((y2-y1)/(x2-x1));
        b=(-m*x1)+y1;
        C=-b;
        B=1;
        A=-m;

        System.out.println("The parameters are A : " +A +", B : "+B+" ,and C :"+C);
        System.out.println("The ecuation is :"+A+"X + "+B+"Y + "+C+" = 0");


    }
}
