package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class numeropar {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);
        int number, condition;
        condition = 1;
        while (condition == 1) {
            System.out.println("Enter a number :");
            number = inputData.nextInt();
            System.out.println("The pair numbers are :");

            for (int i = 1; i <= number; i += 1) {
                if (i % 2 == 0) {
                    System.out.println(i);

                }

            }
            System.out.println("If you want replay write 1 ,if not write 2");
            condition=inputData.nextInt();

        }
    }
}
