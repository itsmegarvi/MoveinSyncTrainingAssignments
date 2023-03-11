package com.saturday.assignments.cafe;

import java.util.ArrayList;
import java.util.List;
import com.saturday.assignments.cafe.Menu.Foods;

public class Waiter {
    List<List<Foods>> order = new ArrayList<>();
    public Waiter(List<Foods> f){
        order.add(f);
    } //This approach might not work considering the order might keep coming later on.
    // We cant be sending the same list with just addition of one order everytime to chef.

    //What can be the alternatives:
    //Instead of sending the list to chef,
    // We can make a queue in chef that when not empty starts cooking
            // But for this we might also want a function that on addition to queue returns order no. + order place time
    //If we do this with priority queue then there would be a function doing totally different jobs

    //In conclusion, it seems till we are not clear about how to solve the main problem, the rest will be subject to change and a
    //waste of time in my opinion

    //Also am in love with big monitor coding
    // I want it I want it I want it


}
