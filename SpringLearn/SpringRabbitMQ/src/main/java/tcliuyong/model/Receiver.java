package tcliuyong.model;

import java.util.concurrent.CountDownLatch;

/**
 * Created by liuyong on 2016/3/11.
 */
//注册Receiver
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
