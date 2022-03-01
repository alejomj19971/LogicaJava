package com.company;

import java.util.Scanner;
public class AlquilerCarros{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);

        double km,fixedAmount,total;

        System.out.println(" Enter the kilometers traveled : ");
        km= inputData.nextDouble();

        if (km<=300 ){
            total= 300000;
            System.out.println("The total amount is : "+total);
        }

        else if(km>300 && km<=1000){
            total=300000+ (km-300)*15000;
            System.out.println("The total amount is : "+total);
        }

        else{
            total=300000+(km-1000)*10000;
            System.out.println("The total amount is : "+total);
        }




    }
}
