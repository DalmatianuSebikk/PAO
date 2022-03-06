package com.company;

public class Person {
    private String name;
    private String surname;
    private int age;
    private long identityNumber;
    private String type;


    // ----- CONSTRUCTOR -----
    public Person(String name, String surname, int age, long identityNumber, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNumber = identityNumber;
        this.type = type;
    }

    public void printStats() {
        System.out.println("Persoana cu numele " + getName() + " " + getSurname() + " are uramtoarele date:");
        System.out.println("Varsta: " + getAge() + "\nNumarIdentitate: " + getIdentityNumber() + "\nGen: " + getType());
    }

    // ----- GETTERE -----
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public String getType() {
        return type;
    }

    // ----- SETTERE -----
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
}


