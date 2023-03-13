package com.saturday.assignments.cafe;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

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

    }


}
