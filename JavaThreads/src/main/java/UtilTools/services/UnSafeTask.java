package UtilTools.services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by liuyong on 16-1-27.
 */
public class UnSafeTask implements Runnable{
    private Date startDate;

    public void run() {
        startDate = new Date();
        System.out.printf("Starting Thread:%s\n", Thread.currentThread().getId(),startDate);
        try{
            TimeUnit.SECONDS.sleep((int)Math.rint(Math.random() * 10));

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.printf("Thread Finished: %s:%s\n",Thread.currentThread().getId(),startDate);
    }
}
