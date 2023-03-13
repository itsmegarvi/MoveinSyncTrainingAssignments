package com.saturday.assignments.atm;

import java.util.*;

public class ATMManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> accountBal = new HashMap<>();
        HashMap<Integer, String> history = new HashMap<>();
        history.put(1111, "Withrawn 500.0, Withrawn 500.0, Deposited 1000.0");
        history.put(2222, "Withrawn 50.0, Withrawn 50.0, Deposited 100.0");
        history.put(3333, "Withrawn 800.0, Withrawn 250.0, Deposited 500.0");
        accountBal.put(1111, 5400.25);
        accountBal.put(2222, 68000.32);
        accountBal.put(3333, 9000.52);
        while (true) {
            System.out.println("Welcome to xyz bank atm, How may we help you today?");
            System.out.println("1. Withraw money");
            System.out.println("2. Transaction History");
            System.out.println("3. End Transaction");
            System.out.print("Choose number: ");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Please enter your pin: ");
                int pin = sc.nextInt();
                if (accountBal.containsKey(pin)) {
                    System.out.println("Please enter the amount: ");
                    double amt = sc.nextDouble();
                    if (amt <= accountBal.get(pin)) {
                        double d = accountBal.get(pin) - amt;
                        accountBal.put(pin, d);
                        String s = history.get(pin) + ", Withrawn " + amt;
                        history.put(pin, s);
                    } else {
                        System.out.println("Invalid pin");
                    }
                }
            } else if (n == 2) {
                System.out.println("Please enter your pin: ");
                int pin = sc.nextInt();
                if (history.containsKey(pin)) {
                    System.out.println(history.get(pin));
                }
            } else if(n==3) {
                break;
            }
            else{
                System.out.println("Please choose a valid number");
            }
        }
    }
}
