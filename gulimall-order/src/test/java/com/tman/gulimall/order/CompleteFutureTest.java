package com.tman.gulimall.order;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompleteFutureTest {

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> f = CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName()), threadPool);
        CompletableFuture<Void> f2 = CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName()),threadPool);

        CompletableFuture.allOf(f,f2).get();

    }
}
