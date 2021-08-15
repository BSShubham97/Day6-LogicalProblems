package com.bridgelabz;
import java.util.Scanner;

public class ReverseNumber {
    public static void doReverse(int num){
        int rev =0;
        int rem=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("REVERSE OF NUMBER is "+rev);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        reverseNumber.doReverse(number);
    }
}