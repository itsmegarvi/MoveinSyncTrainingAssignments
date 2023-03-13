package com.saturday.assignments.cafe;

import com.saturday.assignments.Order;

import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;

public class Chef {
    private int numChefs;
    private int lastCompletedTime;
    public Chef(int n){
        numChefs = n;
        lastCompletedTime = 0;
    }

    public int getLastCompletedTime() {
        return lastCompletedTime;
    }

    public void processorder(int ordernum, int prevEndTime){
        Order order = new Order(ordernum);
        if(!Order.getOrders().isEmpty()) {
            List<Integer> l = order.getOrders(ordernum-1);
            PriorityQueue<Integer> pq = new PriorityQueue<>(numChefs);
            pq.clear();

            l.sort(Integer::compare);
            for(int i=l.size() -1;i>=0;i--){
                if(pq.size() < numChefs){
                    pq.add(l.get(i));
                }else{
                    int minTime = pq.poll();
                    pq.add(minTime + l.get(i));
                }
            }
            while (pq.size() != 1){
                pq.poll();
            }

            int servetime = pq.peek() + prevEndTime;

            lastCompletedTime = servetime;


            System.out.println("You will get your order at " + LocalTime.now().plusMinutes(servetime));

        }
        else{
            System.out.println("NOt getting added to List");
        }

    }

}
