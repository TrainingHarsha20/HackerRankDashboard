package com.harsha.java8.fm;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceImpl {

    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newScheduledThreadPool(5);

        executorService1.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("executorService1 " + threadName);
        });


        executorService2.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("executorService2 " + threadName);
        });

    }
}
