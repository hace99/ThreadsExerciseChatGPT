package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiThreadExampleTest {

    @Test
    public void testThreadExecution3() throws InterruptedException {
        int numThreads = 3;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        for (int i = 0; i < numThreads; i++) {
            assertEquals(Thread.State.TERMINATED, threads[i].getState());
        }
    }

    @Test
    public void testThreadExecution5() throws InterruptedException {
        int numThreads = 5;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        for (int i = 0; i < numThreads; i++) {
            assertEquals(Thread.State.TERMINATED, threads[i].getState());
        }
    }

    @Test
    public void testThreadExecution1() throws InterruptedException {
        int numThreads = 1;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        for (int i = 0; i < numThreads; i++) {
            assertEquals(Thread.State.TERMINATED, threads[i].getState());
        }
    }

    @Test
    public void testNumberOfThreads5() throws InterruptedException {
        int numThreads = 5;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        assertEquals(numThreads, threads.length);
    }

    @Test
    public void testNumberOfThreads3() throws InterruptedException {
        int numThreads = 3;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        assertEquals(numThreads, threads.length);
    }

    @Test
    public void testNumberOfThreads43() throws InterruptedException {
        int numThreads = 43;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        assertEquals(numThreads, threads.length);
    }

    @Test
    public void testNumberOfThreads0() throws InterruptedException {
        int numThreads = 0;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        assertEquals(numThreads, threads.length);
    }
}

