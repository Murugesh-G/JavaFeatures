package com.mg.java21.virtualthreads;

public class MassiveVirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
