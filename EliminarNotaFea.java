package com.company;

import jdk.dynalink.beans.BeansLinker;

import java.util.Scanner;
public class EliminarNotaFea {
    public static void main(String[] args){
        Scanner inputData=new Scanner(System.in);
        double practice1,practice2,practice3,practice4,promedium,worst;

        System.out.println("Enter first practice score : ");
        practice1=inputData.nextDouble();
        System.out.println("Enter second practice score : ");
        practice2=inputData.nextDouble();
        System.out.println("Enter third practice score : ");
        practice3=inputData.nextDouble();
        System.out.println("Enter fourth practice score : ");
        practice4=inputData.nextDouble();

        if (practice1<practice2 && practice1<practice3 && practice1<practice4 ){
            promedium= (practice2+practice3+practice4)/3;
            System.out.println("The total score is : "+promedium);


        }
        else if (practice2<practice1 && practice2<practice3 && practice2<practice4){
            promedium=(practice1+practice3+practice4)/3;
            System.out.println("The total score is : "+promedium);
        }
        else if(practice3<practice1 && practice3<practice2 && practice3<practice4){
            promedium=(practice1+practice2+practice4)/3;
            System.out.println("The total score is : "+promedium);
        }
        else{
            promedium=(practice1+practice2+practice3)/3;
            System.out.println("The total score is : "+promedium);
        }


    }
}
