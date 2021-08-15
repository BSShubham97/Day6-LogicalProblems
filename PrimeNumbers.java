package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {
    //Prime Number
    public static void isPrime(int number) {
        int flag = 0;
        int i;
        int factor = (number / 2);

        if (number == 0 || number == 1) {
            System.out.println("Not Prime");
        } else {
            for (i = 2; i <= factor; i++) {
                if (number % i == 0) {
                    System.out.println("Number: " + number + " is NOT PRIME");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Number is PRIME ");
            }
        }

    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        primeNumbers.isPrime(number);
    }
}
