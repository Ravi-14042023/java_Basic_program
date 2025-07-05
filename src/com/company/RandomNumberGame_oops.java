package com.company;

import java.util.Random;
import java.util.Scanner;

class RandomNum {
    private byte num;

    public byte getNum() {
        return num;
    }

    public void setNum(byte n) {
        num = n;
//
//        Random rand = new Random();
//        byte randNumber = (byte) rand.nextInt(255);
//        byte randomnum = this.num;
//        if (randomnum < randNumber) {
//            System.out.println("Your enter number is lesser than random number");
//        } else if (randomnum > randNumber) {
//            System.out.println("Your enter number is greater than random number");
//        } else System.out.println("you are enter same number as Random number");
    }

    void GenrateNum(){
            Random rand =new Random();
        byte randNumber = (byte) rand.nextInt(10)   ;
        byte randomnum = this.num;
        if (randomnum<randNumber){
            System.out.println("Your enter number is laser than random number");
        } else if (randomnum>randNumber) {
            System.out.println("Your enter number is grater than random number");
        }else System.out.println("you are enter same number as Random number");
    }
}

public class RandomNumberGame_oops {
    public static void main(String[] args) {
        RandomNum RNum = new RandomNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        byte value = sc.nextByte();
        RNum.setNum(value);
        RNum.GenrateNum();
    }
}
