package com.company;
import java.util.Scanner;
public class excercise {
    public static void main(String[] args) {
        System.out.println("enter the marks of student:");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter markes of Math:");
        int Math = sc.nextInt();
        System.out.println("enter markes of Chemistry:");
        int Chemistry = sc.nextInt();
        System.out.println("enter markes of Physics:");
        int Physics = sc.nextInt();
        System.out.println("enter markes of Hindi:");
        int Hindi = sc.nextInt();
        System.out.println("enter markes of English:");
        int English = sc.nextInt();
//        formula of percantage = (sum of obtin numbers/sum of total numbers)*100
        float sum_of_obtin_num = Math+Chemistry+Physics+Hindi+English;
        System.out.println(sum_of_obtin_num);
        int total_num = 500;
        System.out.println("percentage of the student:");
        float percantage = (sum_of_obtin_num*100)/total_num;
        System.out.println(percantage+"%");
    }
}