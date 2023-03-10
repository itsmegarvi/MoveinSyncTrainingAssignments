package com.Module2;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        double aver = 0;
        for(int i=0;i< nums.length;i++){
            nums[i] = sc.nextInt();
            aver += nums[i];
        }

        System.out.println(aver/5);
    }
}
