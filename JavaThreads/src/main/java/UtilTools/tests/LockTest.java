package UtilTools.tests;

import UtilTools.services.LockTask;
import UtilTools.services.PrintQueue;

/**
 * Created by liuyong on 16-1-27.
 */
public class LockTest {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new LockTask(printQueue),"Thread " + i);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
