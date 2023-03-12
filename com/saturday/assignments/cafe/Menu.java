package com.saturday.assignments.cafe;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu{
//    enum Foods{
//        SANDWICH,
//        COFFEE,
//        CEREAL,
//        PIZZA
//    }

    private Map<Integer, MenuItem> menuItems;

    public Menu() {
        this.menuItems = new HashMap<>();
        this.menuItems.put(1, new MenuItem("Sandwich", 5));
        this.menuItems.put(2, new MenuItem("Coffee", 3));
        this.menuItems.put(3, new MenuItem("Cereal", 3));
        this.menuItems.put(4, new MenuItem("Pizza", 7));
    }

    public MenuItem getMenuItem(int id) {
        return this.menuItems.get(id);
    }
}
