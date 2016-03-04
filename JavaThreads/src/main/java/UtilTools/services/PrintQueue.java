package UtilTools.services;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liuyong on 16-1-27.
 */
public class PrintQueue {
    private final Lock queueLock = new ReentrantLock();
    public void printJob(Object document){
        queueLock.lock();
        try{
            Long durantion = (long)(Math.random() * 1000);
            System.out.println(Thread.currentThread().getName() + ":" + (durantion / 1000));
            Thread.sleep(durantion);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            queueLock.unlock();
        }
    }
}
