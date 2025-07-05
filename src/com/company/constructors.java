package com.company;

class myemployee {
    private int age;
    private String name;
    private int salary;


    public myemployee() {
        age = 45;
        name = "pathan";
        salary = 45000;
    }
    public myemployee(String name,int salary){
        this.name = name;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class constructors {
    public static void main(String[] args) {
        //constructor Overloading---
//        myemployee raavan = new myemployee("ravii",90000);
        myemployee raavan = new myemployee();
//        raavan.setAge(54);
//        raavan.setSalary(60000);
//        raavan.setName("R k");
        System.out.println(raavan.getAge());
        System.out.println(raavan.getName());
        System.out.println(raavan.getSalary());
    }
}
