package com.company;

class employee {
    int salary;
    String name;
    byte age;

    public void printDetails() {
//        System.out.println("Name: "+ name);
        System.out.println("age: " + age);
//        System.out.println("salary: "+ salary);
    }

    public int getSalary() {
        return salary;
    }

    public void getName() {
        System.out.println("name: " + name);
//        return name;
    }

    public void SetName(String newName) {
        name = newName;
//        newName = "Rakesh Kumar";
        System.out.println("new name: " + name);
    }
}

class cellphone {
    public void ring() {
        System.out.println("Your phone is ringing.....");
    }

    public void vibrate() {
        System.out.println("Your phone is vibrating....");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class rectangle {
    int width;
    int length;

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return 2 * (width + length);
    }
}

class tommver {
    public void hit() {
        System.out.println("tommy is hitting a enemy....");
    }

    public void run() {
        System.out.println("Tommy is running towards the enemy....");
    }

    public void fire() {
        System.out.println("Tommy is firing at the enemy....");
    }
}


class circle {
    int radius;

    //    float pie = 3.142f;
    public double area() {
        return Math.PI * radius * radius;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }
}

public class Custom_class_practice_set_8 {
    public static void main(String[] args) {
//        Question 1-- make custom class and attributes
        employee rakesh = new employee();
        rakesh.name = "rakesh kumar";
        rakesh.age = 32;
        rakesh.salary = 60000;
        rakesh.printDetails();
//       rakesh.getSalary();
        System.out.println("salary: " + rakesh.getSalary());

        rakesh.getName();
//        System.out.println("name: " + name);
        rakesh.SetName("Rakesh kumar");

//        Problem 2 -- create class and his methods
        cellphone verizon = new cellphone();
        verizon.ring();
        verizon.vibrate();

//        problem 3-- create class square class and intialize area & perimeter..
        Square varg = new Square();
        varg.side = 10;
        System.out.println(varg.area());
        System.out.println(varg.perimeter());


//        Problem 4---create class rectangle class and intialize area & perimeter..
        rectangle aayat = new rectangle();
        aayat.width = 2;
        aayat.length = 4;
        System.out.println(aayat.area());
        System.out.println(aayat.perimeter());

        //    Problem 5 --Create a class TommyVecetti for Rockstar Games Capable of hitting (print hitting.); running, firing
        tommver tommy = new tommver();
        tommy.run();
        tommy.fire();
        System.out.println(tommy.hashCode());
        tommy.hit();

//        Problem 6--create class circle class and intialize area & perimeter..
        circle varit = new circle();
        varit.radius = 12;
        System.out.println(varit.area());
        System.out.println(varit.Circumference());
    }
}
