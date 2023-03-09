package Assignment_Module3;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int m= sc.nextInt();

        //DP ka question hai ye toh
        //Ye nhi hoga humse, brute force kar rhe
        ArrayList<Integer> l = new ArrayList<>();


        int sum = 0;
        int num;
        for(int i=n;i<=m;i++){
            sum = 0;
            num = i;
            while(num>0){
                sum+=num%10;
                num/=10;    // I am so dumb I was doing sum/=10 and wondering why infinite inputs smh
            }

            if(sum==9){
                l.add(i);
            }
        }
//        System.out.println("Hello");
        l.stream().forEach(System.out::println);

    }
}
