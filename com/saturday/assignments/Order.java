package com.saturday.assignments;

import com.saturday.assignments.cafe.Menu;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int ordernumber;
    public List<List<Menu.MenuItem>> items = new ArrayList<List<Menu.MenuItem>>();

    public Order(int orderNumber) {
        this.ordernumber = orderNumber;
    }

    public void addItem(List<Menu.MenuItem> item)
    {
        items.add(item);

    }

    public List<List<Menu.MenuItem>> getItems() {
        return items;
    }

//    public List<Menu.MenuItem> getItems(int i) {
//        return
//    }
}
