package com.Module3;

import java.util.Scanner;

public class CircleData {
    float diameter(float r){
        return 2*r;
    }

    float area(float r){
        return 3.14f*r*r;
    }

    float perimeter(float r){
        return 2*3.14f*r;
    }

    float areasemi(float r){
        return 3.14f*r;
    }

}

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r  = sc.nextFloat();
        String str = sc.next();
        CircleData obj = new CircleData();


        switch (str) {
            case "DIA" -> System.out.printf("%.2f", obj.diameter(r));
            case "AR" -> System.out.printf("%.2f", obj.area(r));
            case "PER" -> System.out.printf("%.2f", obj.perimeter(r));
            case "ARSEM" -> System.out.printf("%.2f", obj.areasemi(r));
            default -> System.out.println("Wrong input!!");
        }
    }
}
