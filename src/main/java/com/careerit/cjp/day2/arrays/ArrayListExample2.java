package com.careerit.cjp.day2.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Krish");
        list1.add("Manoj");
        list1.add("Charan");
        list1.add("Rajesh");
        list1.add("Krish");

        List<String> list2 = new ArrayList<>();
        list2.add("Ram");
        list2.add("Manoj");
        list2.add("Charan");
        list2.add("Rajani");

        List<String> uniqueList = new ArrayList<>();
        for(String name:list1) {
            if(!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        for(String name:list2) {
            if(!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println(uniqueList);
        System.out.println(uniqueList.get(5));
    }
}
