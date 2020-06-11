package com.jeramtough.test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * <pre>
 * Created on 2020/6/4 15:00
 * by @author JeramTough
 * </pre>
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(5, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.execute(() -> {
                System.out.println(finalI);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }
}
