package com.company;

import java.util.Scanner;

public class set5 {
    public static void main(String[] args) {
//        Question 1-- print stars
//        int n = 5;
//        for (int i = n; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Question 2---sum of first n even numbers;
        int N = 10;
        int k = 0;
//        int i = 1;
        for (int j = 1; j <= N; j++) {
            if (j % 2 == 0) {
//                continue;
//                 int j1 = j;
                k += j;
            }

        }
        System.out.println(k);

//           Question 3--- print table of a number;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number here :");
//        int num = sc.nextInt();
//        for (int multi=1; multi<=10; multi++){
//            System.out.println(num+"*"+multi+" ="+num*multi);
//        }

//        Question 4--- print multiplication table in reverse order
//        System.out.println("Enter your number here :");
//        int num = sc.nextInt();
//        for (int multi=10; multi>=1; multi--){
//            System.out.println(num+"*"+multi+" ="+num*multi);
//        }

//        Question 9--calculate the sum of the numbers acuring in the multiplication table

//        System.out.println("Enter your number here :");
//        int num = sc.nextInt();
//        int m = 0;
//        int SofM=0;
//        for (int multi=1; multi<=10; multi++){
//            m = num*multi;
//            SofM = m+SofM;
//            System.out.println(num+"*"+multi+" ="+m);
//            System.out.println(SofM);
//        }

//        Question 5--- factorial of a number;

        System.out.println("Enter your number here :");
        int num = sc.nextInt();
        for (int i=(num-1); i>=1; i--){
            num = num*i;
        }
            System.out.println("factorial of"+num+"is :"+num);
    }

}

