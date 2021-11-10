package com.company;

class Running implements Movement {
    public void start() {
        System.out.println("Move your feet");
    }

    public void stop() {
        System.out.println("Stand still");
    }
}
