package com.careerit.cjp.day2.arrays;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    private List<Integer> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    public void addElement(int ele) {
        list.add(ele);
    }

    public void removeElement(int ele) {
        if (list.contains(ele)) {
            list.remove(Integer.valueOf(ele));
        } else {
            System.out.println("Element " + ele + " is not found");
        }
    }

    public void updateElement(int ele,int newEle) {
        if (list.contains(ele)) {
            int index = list.indexOf(ele);
            list.set(index, newEle);
        } else {
            System.out.println("Element " + ele + " is not found");
        }
    }

    public void searchElement(int ele) {
        if (list.contains(ele)) {
            System.out.println("Element " + ele + " is found at index " + list.indexOf(ele));
        } else {
            System.out.println("Element " + ele + " is not found");
        }
    }

    public void showElements() {
        System.out.println(list);
    }


}
