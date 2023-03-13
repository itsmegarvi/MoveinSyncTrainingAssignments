package com.saturday.assignments;

import com.saturday.assignments.cafe.Menu;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int ordernumber;
    protected static List<List<Integer>> orders = new ArrayList<>();

    public Order(int orderNumber) {
        this.ordernumber = orderNumber;

    }

    public void addItem(List<Menu.MenuItem> item)
    {
        List<Integer> l = new ArrayList<>();
        for(Menu.MenuItem i:item){
            l.add(i.getPreparationTime());
        }
        orders.add(l);

    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public static List<List<Integer>> getOrders() {
        return orders;
    }

    public List<Integer> getOrders(int i) {
        return orders.get(i);
    }
}
