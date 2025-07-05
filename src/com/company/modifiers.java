package com.company;

class circle1 {
    private int radius;

    public void SetRadius(int r) {
        if (r <= 0) {
            System.out.println("plzz enter tha natural number of radius");
        } else
            radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double calculatearea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void Setarea(double userarea) {
        double actualarea = calculatearea();
        if (Math.abs(actualarea - userarea) < 0.01) {
            System.out.println("Your input area is correct!✅");
        } else System.out.println("User input area is wrong! Acutal area should be :" + actualarea);
    }

    public void SetCircumference(double userCircumference) {
        double actualCircumference = calculateCircumference();
        if (Math.abs(actualCircumference - userCircumference) < 0.01) {
            System.out.println("Your input Circumference is correct!✅");
        } else
            System.out.println("User input Circumference is wrong! Acutal Circumference should be :" + actualCircumference);
    }
}

public class modifiers {
    public static void main(String[] args) {
        /*   Problem - create a Java class Circle with private radius, getter/setter methods, and logic to validate user-given area and circumference against calculated values with appropriate warnings.
         */
        circle1 vrit = new circle1();
        vrit.SetRadius(12);
        System.out.println("radius is: "+vrit.getRadius());
        vrit.Setarea(1244.65d);
        vrit.SetCircumference(6543.6543d);

    }
}
