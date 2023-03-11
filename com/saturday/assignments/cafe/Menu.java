package com.saturday.assignments.cafe;

import java.util.Arrays;
import java.util.List;

public class Menu{
    enum Foods{
        SANDWICH,
        COFFEE,
        CEREAL,
        PIZZA
    }

    List<Foods> l = Arrays.asList(Foods.values());
    public void disp(){
        l.forEach(System.out::println);
    }
}
