package com.saturday.assignments.cafe;

import com.saturday.assignments.Order;

import java.time.LocalTime;
import java.util.List;

public class Waiter {

    private static int ordernumber;
//    private static LocalTime lastlogtime;

    private Waiter(){
        throw new IllegalStateException("Utility class");
    }

    public static void takeorder(List<Menu.MenuItem> items){
        ordernumber++;
        Order order = new Order(ordernumber);
        order.addItem(items);
        LocalTime currenttime = LocalTime.now();
        System.out.println("Order number " + ordernumber + " recieved at " + currenttime);
    }

    public static int getOrdernumber() {
        return ordernumber;
    }
}