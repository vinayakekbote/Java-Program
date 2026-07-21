package com.multitreading.ex1;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=50;i++){
            System.out.println("thread1 execute i = " + i);

            try {
                Thread.sleep(50);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread =new Thread(t1);
        thread.start();

        MyThreadsUsingExtendClass myThreadsUsingExtendClass = new MyThreadsUsingExtendClass();
        myThreadsUsingExtendClass.start();
    }
}
