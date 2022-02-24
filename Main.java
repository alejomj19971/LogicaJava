package com.company;

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner inputData= new Scanner(System.in);
        double gSalary,nSalary,retention;
        gSalary=48*5000;
        retention=(0.125*gSalary);
        nSalary=gSalary-retention;
        System.out.println("The gross salary is : "+gSalary);
        System.out.println("The retention is : "+retention);
        System.out.println("The Net Salary is : " +nSalary);




            }
}
