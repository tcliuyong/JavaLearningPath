package ExtendThread.demos;

/**
 * Created by liuyong on 2016/4/16.
 */
public class MyThread extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 10; i++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
