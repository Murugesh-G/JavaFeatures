package com.mg.java21.virtualthreads;

public class VirtualThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread());
        };
        Thread vt = Thread.ofVirtual().start(task);
    }
}
