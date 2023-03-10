package com.Module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindParticipant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students:");
        int n = sc.nextInt();
        System.out.println("Enter the ID's:");
        List<Integer> l = new ArrayList<>();
        while(n>0){
            l.add(sc.nextInt());
            n--;
        }
        boolean flag = true;
        int temp = 0;
        while(flag){
            System.out.println("Enter ID to search:");
            final int searchID = temp = sc.nextInt();
            System.out.println(temp);
            if(l.stream().anyMatch(x->x==searchID)){
                System.out.println("Participant with ID " + searchID + " exists" );
            } else if (temp==0){
                System.out.println("Program terminated");
                flag = false;
            } else{
                System.out.println("Participant with ID " + temp + " doesn't exist");
            }

        }

    }
}
