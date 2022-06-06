package com.example.demo;


public class Porkemon {

    private String name;
    private int age;


    public Porkemon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String magic(){
        return "My magic is flying";
    }

    //getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
