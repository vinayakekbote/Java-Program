package com.multitreading.ex1;

public class MyThreadsUsingExtendClass extends Thread {

    public void run(){
        for(int i=50; i>=1; i--){
            System.out.println("Thread2 is executing i = " + i);
            try {
                Thread.sleep(50);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
