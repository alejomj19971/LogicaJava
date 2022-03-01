package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class LaboratorioClinico{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);

    int years,months;
    double nivelHemoglobina;

        System.out.println("Enter the patient age in months and years : ");
        System.out.println(" Months (0-12) :");
        months= inputData.nextInt();
        System.out.println(" Years :");
        years=inputData.nextInt();
        System.out.println("Enter the hemoglobine level (g%) :");
        nivelHemoglobina=inputData.nextDouble();


        if (months<=1){

            if(nivelHemoglobina>=13 && nivelHemoglobina<=26){
                System.out.println("Negative");

                    }
            else{
                System.out.println(" Positive ");
                 }

            }

       else if(months>1 && months<=6){

           if(nivelHemoglobina>=10 && nivelHemoglobina<=18){
               System.out.println("Negative");

           }

           else {
               System.out.println("Positive");
           }

       }

        else if(months>6 && months<=12){

            if(nivelHemoglobina>=11 && nivelHemoglobina<=15){
                System.out.println("Negative");

            }

            else {
                System.out.println("Positive");
            }

        }

        else if(years>1 && years<=5){

            if(nivelHemoglobina>=11.5 && nivelHemoglobina<=15){
                System.out.println("Negative");

            }

            else {
                System.out.println("Positive");
            }

        }


        else if(years>5 && years<=10){

            if(nivelHemoglobina>=12.6 && nivelHemoglobina<=15.5){
                System.out.println("Negative");

            }

            else {
                System.out.println("Positive");
            }

        }

        else {
            if(years>10 && years<=15){

                if(nivelHemoglobina>=13 && nivelHemoglobina<=15.5){
                    System.out.println("Negative");

                }

                else {
                    System.out.println("Positive");
                }

            }
        }


    }
}
