package com.company;

public class loops {
    public static void main(String[] args) {

//        while loop -- print natural number 100 to 200
        int i = 5;
        while (i >= 2) {
            System.out.println(i);
            i--;
        }

//            do- while loop-- print first n natural number
        int j = 1;
        do {
            System.out.println("value of j\n" + j);
            j++;

        } while (j <= 5);

//       for loop-- print first n odd numbers
//        int n = 10;
        int k = 1;
        for (int n = 1; n <= 10; n++) {
            System.out.println(k);
            k = 2 * n + 1;
        }
        int n = 10;
        for (int m = n; m>0; --m){
            System.out.println(m);
        }

    }

}
