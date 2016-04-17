package ExtendThread.demos;

/**
 * Created by liuyong on 2016/4/16.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        System.out.println("over");
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("run over");
    }
}
