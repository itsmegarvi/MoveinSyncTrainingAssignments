package Assignment_Module3;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                continue;
            }
            for(int j = 0;j<i-1;j++){
                System.out.print(i + " ");
            }
            System.out.println(i);

        }
    }
}
