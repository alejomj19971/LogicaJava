package com.company;

import java.util.Scanner;
public class Ejercicio7{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        String name;
        double employeecode,wHours,hourvalue,retention,gSalary,nSalary;

        System.out.println("Enter employee name : ");
        name=inputData.next();

        System.out.println("Enter employeecode : ");
        employeecode=inputData.nextDouble();

        System.out.println("Enter Payment per hour : ");
        hourvalue=inputData.nextDouble();

        System.out.println("Enter hours worked : ");
        wHours=inputData.nextDouble();

        System.out.println("Enter retention percentage 1-100 : ");
        retention=inputData.nextDouble();

        gSalary=wHours*hourvalue;
        nSalary=gSalary-(gSalary*(retention/100));

        System.out.println("The employee name is : "+name);
        System.out.println("The employee code is : "+employeecode);
        System.out.println("The gross Salary is  : "+gSalary);
        System.out.println("The Net Salary is    : "+nSalary);



    }
}
