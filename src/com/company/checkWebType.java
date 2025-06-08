package com.company;

import java.util.Scanner;

public class checkWebType {
    public static void main(String[] args) {
//        problem---6 find the type of website from the url
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your url");
        String url = sc.nextLine();
        if (url.endsWith(".com")) {
            System.out.println("Your website is a commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("Your website is a organization website");

        } else if (url.endsWith(".in")) {
            System.out.println("Your website is a indian website");

        } else
            System.out.println("Unknown website type");

    }
}
