package ThreadsPool.normalpool;

/**
 * Created by liuyong on 2016/5/13.
 */
public class Task implements Runnable {
    private int idx;

    public Task(int idx) {
        this.idx = idx;
    }

    public void run() {
        System.out.println(idx);
    }
}
