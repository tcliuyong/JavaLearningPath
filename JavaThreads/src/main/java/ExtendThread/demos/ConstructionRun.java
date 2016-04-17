package ExtendThread.demos;

/**
 * Created by liuyong on 2016/4/16.
 */
public class ConstructionRun extends Thread {
    public ConstructionRun(){
        System.out.println("构造方法："+Thread.currentThread().getName());
    }
    public void run(){
        System.out.println("run 方法打印:" +Thread.currentThread().getName());
    }
}
