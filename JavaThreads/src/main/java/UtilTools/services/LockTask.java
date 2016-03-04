package UtilTools.services;

import UtilTools.services.PrintQueue;

/**
 * Created by liuyong on 16-1-27.
 */
public class LockTask implements Runnable {
    private PrintQueue printQueue;

    public LockTask(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    public void run() {
        System.out.printf("%s:Going to print a document \n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s has bend printed \n", Thread.currentThread().getName());
    }
}
