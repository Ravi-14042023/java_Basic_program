package com.company;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        String[] strings = {"rock", "paper", "sijor"};
        Random random = new Random();
        int index = random.nextInt(strings.length);  // Generate random index

        String rand = strings[index];  // Store the random string in variable 'rand'
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one of the following: rock, paper, sijor");
        String value = sc.next();
        if (rand.equals(value)) {
            System.out.println("computer choose: "+rand);
            System.out.println("match draw!, try again!");
        } else if ((rand.equals("rock") && value.equals("sijor")) || (rand.equals("sijor") && value.equals("paper")) || (rand.equals("paper") && value.equals("rock"))) {
            System.out.println("computer choose: "+rand);
            System.out.println("you lost!\n\tBetter luck next time!");
        } else if ((rand.equals("sijor") && value.equals("rock")) || (rand.equals("paper") && value.equals("sijor")) || (rand.equals("rock") && value.equals("paper"))) {
            System.out.println("computer choose: "+rand);
            System.out.println("Hurry! you win");
        }else
            System.out.println("Your entered value is incorrect ! plz try again");

    }
}
