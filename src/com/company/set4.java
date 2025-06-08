package com.company;

import java.util.Scanner;

public class set4 {
    public static void main(String[] args) {

//        problem 1--- output of the Question
        int a = 10;
        if (a == 11) {
            System.out.println("i am 11");
        } else
            System.out.println("I am not 11");

//        problem 2----find that student fail or pass

        Scanner sc = new Scanner(System.in);
//        System.out.println("marks of sub1 out of 100:");
//        int sub1 = sc.nextInt();
//        System.out.println("marks of sub2 out of 100:");
//        int sub2 = sc.nextInt();
//        System.out.println("marks of sub3 out of 100:");
//        int sub3 = sc.nextInt();
//
//        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
//            System.out.println("you are passed");
//        } else
//            System.out.println("you are fail !");

//        problem 3---- calculate tax as per income

        System.out.println("Enter you income:");
        int income = sc.nextInt();
        int i = 500000;
        if (income >= 250000 && income < i) {
            System.out.println("You will have to pay 5% tax");
        } else if (income >= i && income < 1000000) {
            System.out.println("You will have to pay 20% tax");

        } else if (income >= 100000) {
            System.out.println("You will have to pay 30% tax");
        } else
            System.out.println("There is no tax for you!");

//        problem 4----find out the day of the week given by number;
        System.out.println("Enter the value of the week");
        int value = sc.nextInt();
        switch (value) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> throw new IllegalStateException("Unexpected value: " + value + " , value must be between 1 to 7");
        }
//            problem 5--- check leap year or not
//                sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + " is not a leap year");

        sc.nextLine();

//        problem---6 find the type of website from the url
        System.out.println("Enter your url");
        String url = sc.nextLine();
        if (url.endsWith(".com")){
            System.out.println("Your website is a commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("Your website is a organization website");
            
        } else if (url.endsWith(".in")) {
            System.out.println("Your website is a indian website");
            
        }else
            System.out.println("Unknown website type");

    }
}
