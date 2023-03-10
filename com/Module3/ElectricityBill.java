package com.Module3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int prev_read, new_read;
        Scanner sc = new Scanner(System.in);
        prev_read = sc.nextInt();
        new_read = sc.nextInt();
        float bill = 0.0f;
        int units_consumed = new_read - prev_read;
        if(units_consumed<=30){
            bill += units_consumed*2.3f;
        } else if (units_consumed<=70){
            bill += (units_consumed-30)*3.5f + (30*2.3f);
        } else{
            bill = (units_consumed-70)*4.6f + (30*2.3f) + (40*3.5f);
        }

        System.out.printf("Electricity bill is: Rs" + "%.2f",bill);
    }
}
