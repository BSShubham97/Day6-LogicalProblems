package com.bridgelabz;
import java.util.Scanner;

/**
 * Program to get Fibonacci series till a given number
 */
public class FibonacciSeries {
    public static void giveFibonacciSeries(int limit) {

        int i;
        int number = 0;
        System.out.println("Fibonacci Series till " + limit + " is:");
        for (i = 1; i <= limit; i++) {
            number = number + i;

            System.out.print(" " + number + " ");
        }

    }

    public static void main(String[] args) {
        FibonacciSeries fibseries = new FibonacciSeries();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of series: ");
        int limit = scanner.nextInt();
        fibseries.giveFibonacciSeries(limit);

    }
}

