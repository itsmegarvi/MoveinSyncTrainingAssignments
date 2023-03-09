package Assignment_Module3;

import java.util.Scanner;

public class ClassRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        //It would have been better if number of students seating in a class would have been given first
        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int st = sc.nextInt();
        for(int i:arr){
            if(i>st){
                count++;
            }
        }

        System.out.println(count);
    }
}
