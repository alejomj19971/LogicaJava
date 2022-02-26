package com.company;

import java.util.Scanner;
public class g3 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int numwheels, total;
        System.out.println("Enter number of wheels : ");
        numwheels = inputData.nextInt();
        if (numwheels < 5) {
            total = 30000 * numwheels;
            System.out.println("The total amount for the wheels is :" + total);
        }
        else {

            if (numwheels <= 10) {
                total = 25000 * numwheels;
                System.out.println("The total amount for the wheels is :" + total);


            }
            else{
                if (numwheels > 10) {
                    total = 20000 * numwheels;
                    System.out.println("The total amount for the wheels is :" + total);


                }
            }


            }


    }
}
