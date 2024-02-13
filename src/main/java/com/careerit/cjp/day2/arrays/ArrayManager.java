package com.careerit.cjp.day2.arrays;

public class ArrayManager {

    public static void main(String[] args) {

            MyArray obj = new MyArray();
            obj.addElement(10);
            obj.addElement(20);
            obj.addElement(30);
            obj.addElement(40);
            obj.addElement(50);
            obj.addElement(60);
            obj.addElement(70);

            obj.showElements();
            obj.removeElement(20);
            obj.updateElement(40, 45);
            obj.showElements();
    }
}
