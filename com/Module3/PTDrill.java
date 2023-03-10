package com.Module3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PTDrill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> l = new ArrayList<>();
        for(int i =0;i<n;i++){
            l.add(sc.next());
        }
        double h = Math.sqrt(n);
        int j = (int) h;
        final List<String> o = l.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
        List<List<String>> ls = IntStream.range(0,l.size()/j).mapToObj(a->o.subList((a*j),(a+1)*j)).collect(Collectors.toList());


        List<String> middleRow = ls.get(ls.size() / 2);
        System.out.println("Middle row: " + middleRow);

        List<String> middleColumn = ls.stream()
                .map(row -> row.get(row.size() / 2))
                .collect(Collectors.toList());
        System.out.println("Middle column: " + middleColumn);
    }
}
