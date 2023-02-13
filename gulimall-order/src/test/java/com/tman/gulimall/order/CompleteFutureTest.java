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
        // 没有返回值，且不传递参数
        CompletableFuture<Void> f = CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName()), threadPool);
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync((() -> {
            System.out.println(Thread.currentThread().getName() + " supplyAsync");
            return "thenAccept";
        }), threadPool);
        f2.thenAccept(e->{
            System.out.println(Thread.currentThread().getName() +" thenAccept 接收到supplyAsync 的值：" +e);
        });
        CompletableFuture.allOf(f,f2).get();

    }
}
