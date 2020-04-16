package com.company;

public class Main {

    public static void main(String[] args) {

        Book<Number> shantaram = new Book<>(3, 1200);
        shantaram.read();

        Book<Integer> norvegianForest = new Book<>(6, 300);
        norvegianForest.read();
    }
}
