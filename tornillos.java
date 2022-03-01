package com.company;
import java.util.Scanner;
public class tornillos {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int nFaultyScrew, nProducedScrew;
        System.out.println("Enter the number of faulty screws :");
        nFaultyScrew = inputData.nextInt();
        System.out.println(" Enter the number of produced screws :");
        nProducedScrew = inputData.nextInt();

        if (nFaultyScrew >= 200 && nProducedScrew <=10000) {
            System.out.println("The screw efficienc2y degree is five");
        } else if (nFaultyScrew < 200 && nProducedScrew <= 10000) {
            System.out.println("The screw efficiency degree is six");

        } else if (nFaultyScrew >= 200 && nProducedScrew > 10000) {
            System.out.println("The screw efficiency degree is seven");

        } else if (nFaultyScrew < 200 && nProducedScrew > 10000) {

            System.out.println("The screw efficiency degree is eight");

        }
        else {


        }
    }
}
