package UtilTools.tests;

import UtilTools.services.UnSafeTask;

import java.util.concurrent.TimeUnit;

/**
 * Created by liuyong on 16-1-27.
 */
public class UnSafeTest {
    public static void main(String[] args) {
        UnSafeTask unSafeTask = new UnSafeTask();
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(unSafeTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
