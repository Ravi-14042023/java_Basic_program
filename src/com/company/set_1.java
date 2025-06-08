package com.company;

import java.util.Scanner;

public class set_1 {
    public static void main(String[] args) {
//        Question 1
         int a = 54;
         int b = 35;
         int c = 76;
         int sum = a+b+c;
//        System.out.println("sum of a,b,c: "+sum);

//        Question 2----
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in 3 subjects:");
        System.out.println("marks of math:");
//        int math = sc.nextInt();
        System.out.println("marks of physics:");
//        int physics = sc.nextInt();
        System.out.println("marks of chemistry:");
//        int chemistry = sc.nextInt();

        int total_marks = 100*3;

//        firstly we calculate the percantage
//        float obtin_marks = math+physics+chemistry;

//        float percent = obtin_marks*100/total_marks;
//        System.out.println("percentage:"+percent+"%");

//        now we calculate the cgpa-----
//        float cgpa = percent/9.5f;
//        System.out.println("cgpa of the student is : "+cgpa);

//        Question 3----
        System.out.println("Enter the name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello "+name+", have a good day!");

        System.out.println("enter int value:");
        boolean value = s.hasNextInt();
        System.out.println(value);

    }
}
