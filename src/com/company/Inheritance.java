package com.company;

class circles {
    private int radius;

    public circles(int r) {
        this.radius = r;
    }

//    circles() {
//    }

    public int getRadius() {
        return radius;
    }
}

class cylinders extends circles {
    private int h;

    public cylinders(int r) {
        super(r);
    }

    public void print() {
        System.out.println(this.getRadius());
        System.out.println(getH());
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        problem 1--Using inheritance…
//        circles c1 = new circles(23);
        cylinders c2 = new cylinders(323);
//        c2.radius = 23;
//        c2.h = 43;
        c2.setH(32);
        c2.print();
//        System.out.println(c2.getRadius());


    }
}
