package com.multitreading.ex1;

class Threads implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100; i++){
            System.out.println("thread 2 ");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Ex2 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<100; i++){
            System.out.println("thread 1 ");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        Thread t = new Thread(ex2);

        Threads threads = new Threads();
        Thread t2 = new Thread(threads);

        Thread t1 = new Thread(ex2);
        t2.start();

        t.start();
        t1.start();
    }
}
