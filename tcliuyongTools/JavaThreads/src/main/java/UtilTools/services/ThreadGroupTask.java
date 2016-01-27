package UtilTools.services;

import UtilTools.beans.Result;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by liuyong on 16-1-27.
 */
public class ThreadGroupTask implements Runnable{
    private Result result;

    public ThreadGroupTask(Result result) {
        this.result = result;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("Thread %s:Start\n",name);
        try{
            doTask();
            result.setName("lyong");
        }catch (InterruptedException e){
            System.out.printf("Thread %s:End\n",name);
            return;
        }
        System.out.printf("Thread %s:End",name);

    }

    private void doTask() throws InterruptedException {
        Random random = new Random(new Date().getTime());
        int value = (int) (random.nextDouble() * 100);
        System.out.printf("Thead %s: %d\n",Thread.currentThread().getName(),value);
        TimeUnit.SECONDS.sleep(value);
    }
}
