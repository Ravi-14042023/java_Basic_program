package com.company;

class rectanglee {
    private final int width;
    private final int lenght;

    public rectanglee() {
        lenght = 12;
        width = 23;
    }
    public rectanglee(int w,int l){
        this.lenght = l;
        this.width = w;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }
}

class cylinder {
    private int radius;
    private int height;

    public cylinder(int h, int r) {
        setRadius(r);
        setHeight(h);
    }

    public cylinder() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
        //System.out.println(radius);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
        //System.out.println(height);
    }

    public double SurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Access_Modifiers_And_Constructors {
    public static void main(String[] args) {
        //problem 1---- getter and setter for cylinder height and radius
        cylinder c1 = new cylinder();
        c1.setHeight(12);
        // c1.getHeight();
        c1.setRadius(4);
        // c1.getRadius();
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());

        //Problem 2--calculate surface area and volume of a cylinder
        System.out.println("volume of cylinder: " + c1.volume());
        System.out.println("Suface area of cylinder: " + c1.SurfaceArea());

//        Problem 3-- using Constructor in this
        cylinder c2 = new cylinder(4, 6);

        //using parameters
        System.out.println("\nvolume of cylinder: " + c2.volume());
        System.out.println("Suface area of cylinder: " + c2.SurfaceArea());

//        problem 4--overload a constructor rectangle using parameters...
rectanglee r1 = new rectanglee(34,45);
        System.out.println("\nlenght of rectangle: "+r1.getLenght());
        System.out.println("width of rectangle: "+r1.getWidth());



//        Problem 5--Repeat 1 for a sphare..
    }
}
