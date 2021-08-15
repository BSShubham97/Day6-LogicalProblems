package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number;
        int i;
        int divisor_pool = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();

        for (i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisor_pool = divisor_pool + i;
            }
            else{
                continue;
            } }

            if (divisor_pool == number)
                System.out.println("The number is a perfect number");
            else
                System.out.println("The number is not a perfect number");
        }

    }

