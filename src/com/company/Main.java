package com.company;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startMovement();
        System.out.println();
        facade.stopMovement();
    }
}

