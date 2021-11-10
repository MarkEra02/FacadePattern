package com.company;

class Flying implements Movement {
    public void start() {
        System.out.println("Fly up");
    }

    public void stop() {
        System.out.println("Land");
    }
}
