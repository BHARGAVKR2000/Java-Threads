package com.java.multithreading;

class MultiThreading {
    public void execute(){
        System.out.println("Executing the method...");
    }
}

class Mytask2 extends MultiThreading implements Runnable{
    @Override
    public void run() {
        super.execute();
        for(int i = 0;i < 10 ;i++){
            System.out.println("^^ Printing document "+i+" from printer 3 ");
        }
    }
}

public class Mytask extends Thread {

    @Override
    public void run() {
        for(int i = 0;i < 10 ;i++){
            System.out.println("@@ Printing document "+i+" from printer 1 ");
        }
    }
}


