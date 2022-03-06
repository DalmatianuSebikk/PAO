package com.company;

public class Main {

    public static void main(String[] args) {

        Person X = new Person("Dumitru", "Daniel", 10, 12765, "M");
        Person Y = new Person("Bogdan", "Andrei", 40, 35123, "M");

        X.printStats();
        Y.printStats();
        System.out.println("----------------------------------------");

        Room r1 = new Room(402, "dubla", 4);
        Room r2 = new Room(413, "tripla premium", 2);

        r1.printStats();
        r2.printStats();
        System.out.println("----------------------------------------");

        Subject romana = new Subject(r1, 20, X);
        Subject engleza = new Subject(r2, 14, Y);

        romana.printStats();
        engleza.printStats();
        System.out.println("----------------------------------------");
    }
}
