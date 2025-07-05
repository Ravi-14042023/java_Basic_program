package com.company;

public class array {
    public static void main(String[] args) {
//        Array ----
//        print array in reverse order---
        int[] marks = {78, 45, 56, 87, 89};
        System.out.println(marks);
//        System.out.println(marks[0]);
        int val = marks.length-1;
        for (int i = val; i>=0;i--){
            System.out.println(marks[i]);
        }

    }
}
