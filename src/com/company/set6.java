package com.company;

import java.util.Scanner;

public class set6 {
    public static void main(String[] args) {
//        Arrays----
//        Question 1--- sum of arrays value
        float[] values = {20.9f, 20.6f, 20.4f, 20.8f, 20.9f};
        int val;
        float sum = 0;
        for (val = 0; val < values.length; val++) {
            sum += values[val];
            System.out.println(values[val]);
        }
        System.out.println(sum);

//        Question 2-- find the value in array
        byte[] i = {3, 5, 8, 18, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value here :");
        byte valu = sc.nextByte();
        boolean isInarray = false;
        for (int j : i) {
            if (valu == j) {
                isInarray = true;
                break;
            }
        }
        if (isInarray) {
            System.out.println("the value is in array");
        } else {
            System.out.println("value is not in array");
        }

//        Question 3--- average of a array;
        int[] marks = {56,56,45,67,78,89,87,98,94,95,35,87};
        int add = 0;
        for (int element : marks){
            add +=element;
        }
        float avg = (float) add/ marks.length;
        System.out.println(avg);
    }
}
