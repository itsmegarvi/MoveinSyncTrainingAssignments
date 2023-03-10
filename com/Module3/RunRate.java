package com.Module3;

import java.util.Scanner;

public class RunRate {
    public static void main(String[] args) {
        int overs,target;
        float cr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of overs bowled: ");
        overs = sc.nextInt();
        System.out.println("Enter the current run-rate: ");
        cr = sc.nextFloat();
        System.out.println("Enter the target for run-chase: ");
        target = sc.nextInt();

        float req_run_rate = (target-(cr*overs))/(50-overs);
        System.out.println("Required run-rate is: " + req_run_rate);
    }
}
