package com.saturday.assignments.cafe;

import com.saturday.assignments.Order;

import java.util.List;
import java.util.Queue;

public class Waiter {

    public static int ordernumber;

    public void takeorder(List<Menu.MenuItem> items){
        ordernumber++;
        Order order = new Order(ordernumber);
        order.addItem(items);
    }




}