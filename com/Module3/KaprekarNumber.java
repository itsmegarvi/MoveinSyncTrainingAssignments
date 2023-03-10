package com.Module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = n*n;
        String s = Integer.toString(nn);
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        int res = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(s1 + " " + s2);
        if(res == n){
            System.out.println(n+" is a Kaprekar number");
        }
        else{
            System.out.println("Not a Kaprekar number");
        }
    }
}
