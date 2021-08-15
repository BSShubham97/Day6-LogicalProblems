package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    private long start;

    public void startWatch() {
        start = System.currentTimeMillis();
    }

    public long giveTimeDiff() {
        long time_now = System.currentTimeMillis();
        return (time_now - start) / 1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        System.out.println(" TIME STARTED ");
        stopWatch.startWatch();
        System.out.println("Enter 1 to STOP");
        int entered_key= sc.nextInt();
        if(entered_key==1) {
            System.out.println("Time elapsed is "+stopWatch.giveTimeDiff()+" seconds");
        }

    }
}

