package UtilTools.tests;

import UtilTools.beans.Result;
import UtilTools.services.ThreadGroupTask;

import java.util.concurrent.TimeUnit;

/**
 * Created by liuyong on 16-1-27.
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Searcher");
        Result result = new Result();
        ThreadGroupTask threadGroupTask = new ThreadGroupTask(result);
        for(int i = 0 ;i < 5; i++){
            Thread thread = new Thread(threadGroup, threadGroupTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("Number of Threads: %d\n",threadGroup.activeCount());//获取线程组包含的线程数
        System.out.printf("Information about the Thread Group\n");
        threadGroup.list();
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for(int i = 0; i < threadGroup.activeCount(); i++){
            System.out.printf("Thread %s:%s\n",threads[i].getName(),threads[i].getState());
        }
        threadGroup.interrupt();
    }
}
