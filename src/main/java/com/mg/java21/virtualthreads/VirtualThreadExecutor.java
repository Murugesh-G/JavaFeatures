package com.mg.java21.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadExecutor {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 1000).forEach(i ->
                    executor.submit(() -> {
                        System.out.println("Task " + i + " running on " + Thread.currentThread());
                        Thread.sleep(500);
                        return null;
                    })
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
