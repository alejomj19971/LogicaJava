package com.company;

import java.util.Scanner;
public class ValorR{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
    double x,y,a,b,c,d,R;
        System.out.println("Enter X : ");
        x=inputData.nextDouble();
        System.out.println("Enter Y : ");
        y=inputData.nextDouble();
        System.out.println("Enter A : ");
        a=inputData.nextDouble();
        System.out.println("Enter B : ");
        b=inputData.nextDouble();
        System.out.println("Enter C : ");
        c=inputData.nextDouble();
        System.out.println("Enter D : ");
        d=inputData.nextDouble();
        if((x*y)>0){
            R=(a*b)/(c*d);
            System.out.println("R value is :"+R);
        }
        else if((x*y)==0){
            R=(a+b)/(c+d);
            System.out.println("R value is :"+R);
        }
        else{
            R=(a+b)-c+d;
            System.out.println("R value is :"+R);
        }


    }
}
