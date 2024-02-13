package com.careerit.cjp.day2.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("Rajesh");
        System.out.println(list);
        list.remove("Manoj");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Krish"));
        System.out.println(list.subList(0, 2));
        list.set(0, "Krishna");
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Using for each loop");
        for(String name:list) {
            System.out.println(name);
        }
    }
}
