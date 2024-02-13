package com.careerit.cjp.day2.arrays;

public class MyArray {

    int[] arr;
    int count = 0;

    public MyArray() {
        arr = new int[3];
    }

    public void addElement(int ele) {
        if (count == arr.length) {
            int[] temp = new int[arr.length + 3];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[count++] = ele;
    }

    public void removeElement(int ele) {
        int index = indexOf(ele);
        if (index == -1) {
            System.out.println("Element " + ele + " is not found");
        } else {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
    }

    public void updateElement(int ele,int newEle) {
        int index = indexOf(ele);
        if (index == -1) {
            System.out.println("Element " + ele + " is not found");
        } else {
            arr[index] = newEle;
        }
    }

    public void searchElement(int ele) {
        int index = indexOf(ele);
        if (index == -1) {
            System.out.println("Element " + ele + " is not found");
        } else {
            System.out.println("Element " + ele + " is found at index " + index);
        }
    }

    public void showElements() {
        if (count == 0) {
            System.out.println("[]");
        } else {
            String str = "[";
            for (int i = 0; i < count - 1; i++) {
                str += arr[i] + ",";
            }
            str += arr[count - 1] + "]";
            System.out.println(str);

        }
    }

    private int indexOf(int ele) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (arr[i] == ele) {
                index = i;
                break;
            }
        }
        return index;
    }
}
