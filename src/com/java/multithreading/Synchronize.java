package com.java.multithreading;

public class Synchronize {
}

class Printer {
    public void printDocuments(int noOfCopies, String documentName){
        for(int i=1; i<=noOfCopies; i++){
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Printing document "+documentName+" "+i);
        }
    }
}

class Mytask3 extends Thread {
    Printer ptr;

    public Mytask3(Printer ptr) {
        this.ptr = ptr;
    }

    @Override
    public void run() {
        synchronized(ptr) {     // synchronized block one the key is acquired it releases only after it finished it's execution
            ptr.printDocuments(5,"CNS Record");
        }

    }
}

class Mytask4 extends Thread {
    Printer ptr;

    public Mytask4(Printer ptr) {
        this.ptr = ptr;
    }

    @Override
    public void run() {
        synchronized(ptr){
            ptr.printDocuments(10, "DBMS Record");
        }
    }
}

