package com.saturday.assignments.cafe;


import java.util.Arrays;

import static java.lang.System.out;

public class Menu{
    public enum MenuItem {
        SANDWICH( 5),
        COFFEE( 3),
        CEREAL(3),
        PIZZA( 7);

        private final int preparationTime;

        MenuItem(int preparationTime) {
            this.preparationTime = preparationTime;
        }

        public int getPreparationTime(){
            return preparationTime;
        }

        public static void display(){
            out.println(Arrays.asList(MenuItem.values()));
        }

    }


}
