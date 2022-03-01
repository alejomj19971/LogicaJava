package com.company;

import java.util.Scanner;
public class fruteria{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double wApples,total,ntotal,price,discount;

        System.out.println("Enter Apples weight (Kg) :");
        wApples= inputData.nextDouble();
        System.out.println("Enter apple price :");
        price= inputData.nextDouble();

        if(wApples<=2){
            total=(wApples*price)-(wApples*price*0);
            System.out.println("The total amount is : "+total);
        }

        else{
            if(wApples>2 && wApples<=5){
                total=(wApples*price)-(wApples*price*0.10);
                System.out.println("The total amount is : "+total);

            }
            else {
                if(wApples>5 && wApples<=10){
                    total=(wApples*price)-(wApples*price*0.15);
                    System.out.println("The total amount is : "+total);
                }
                else{
                    total=(wApples*price)-(wApples*price*0.20);
                    System.out.println("The total amount is : "+total);
                }
            }
        }




    }

}
