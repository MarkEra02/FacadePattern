package com.company;

class Facade {
    private Flying flying;
    private Running running;

    public Facade() {
        flying = new Flying();
        running = new Running();
    }

    public void startMovement() {
        flying.start();
        running.start();
    }

    public void stopMovement() {
        flying.stop();
        running.stop();
    }
}
