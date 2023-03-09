package Assignment_Module3;

import java.util.Scanner;

//This question is so fuckin dumb
//Profit percentage should be off all the transactions
//but they are calculating for only one fucking egg
public class ProfitnLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        float gain,profit;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        float amt = (float)y/12;
        gain = z-amt;
        profit = (gain/amt)*100;

        System.out.printf("%.2f",profit);


    }
}
