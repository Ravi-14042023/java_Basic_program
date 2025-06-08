package com.company;

import java.util.Random;
import java.util.Scanner;

public class set_2 {
    public static void main(String[] args) {
//        Question 3---
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(101);
        int num = sc.nextInt();
        System.out.println(randomNum>num);

//        Question 4----
        int a = 2;
        int v = 4;
        int u = 2;
        int s = 1;
        int k = (v*v-u*u)/(2*a*s);
        System.out.println(k);

//        Question 5--
        int x = 6;
        a = 7*49/7+35/7;
        System.out.println("value of a is :" +a);
    }
}
