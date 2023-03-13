package com.saturday.assignments.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveInSyncCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No.of chefs");
        int chefs = sc.nextInt();
        Chef chef = new Chef(chefs);
        int prevEndTime = 0;
        while (true){
            System.out.println("Would you like to order: yes/no");
            String s = sc.next();
            if(s.equals("no")){
                break;
            } else if (s.equals("yes")) {
                System.out.println("Here is the Menu");
                Menu.MenuItem.display();
                System.out.println("Enter Order: ");
                sc.nextLine();
                String order = sc.nextLine();
                List<Menu.MenuItem> orderItems = new ArrayList<>();
                String[] orderSplit = order.split(" ");
                for (String item : orderSplit) {
                    try {
                        Menu.MenuItem menuItem = Menu.MenuItem.valueOf(item);
                        orderItems.add(menuItem);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Your order item not in Menu.");
                    }
                }
                Waiter.takeorder(orderItems);
                chef.processorder(Waiter.getOrdernumber(), prevEndTime); // pass the time of the last completed order
                prevEndTime = chef.getLastCompletedTime();
            }



        }
    }
}
