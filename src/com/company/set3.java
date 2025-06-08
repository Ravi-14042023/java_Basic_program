package com.company;

import java.util.Locale;

public class set3 {
    public static void main(String[] args) {

//        Problem 1---- convert in lowercase
        String name = "Ravii Kalyan";
        System.out.println(name.toLowerCase(Locale.ROOT));

//        problem 2----- replace space with underscore

        System.out.println(name.replace(" ","_"));

//        problem 3--- replace a name
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>","ravii"));

//        problem 4---- detect space
        String value = "hello  ravii";
        System.out.println(value.contains("   "));

//        problem 5---- escape sequence
//        String letter2 = " Dear Harry, This Java Course is nice. Thanks";
//        System.out.println(letter2);

        System.out.println("\"   Dear Harry,\n\tThis Java Course is nice.\nThanks\"");
    }
}
