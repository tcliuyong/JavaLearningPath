package ThreadsPool.normalpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by liuyong on 2016/5/13.
 */
public class ThreadPoolExecutor{
    public static void main(String[] args) {
        //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
        ExecutorService cachedThreadPool  = Executors.newCachedThreadPool();
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        //创建一个定长线程池，支持定时及周期性任务执行
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        cachedThreadPool.execute(new Task(1));
        fixedThreadPool.execute(new Task(2));
        scheduledThreadPool.schedule(new Task(3), 3, TimeUnit.SECONDS);//表示延迟3秒执行
        singleThreadExecutor.execute(new Task(4));
    }
}
