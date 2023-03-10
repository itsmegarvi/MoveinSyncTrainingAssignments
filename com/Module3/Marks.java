package com.Module3;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }

        System.out.println(l.stream().max(Integer::compare).orElseThrow(NoSuchElementException::new));
        System.out.println(l.stream().min(Integer::compare).orElseThrow(NoSuchElementException::new));
        System.out.println(l.stream().mapToDouble(x->x).average().orElseThrow(NoSuchElementException::new));
    }
}
