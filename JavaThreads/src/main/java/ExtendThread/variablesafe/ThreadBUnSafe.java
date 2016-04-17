package ExtendThread.variablesafe;

/**
 * Created by liuyong on 2016/4/16.
 */
public class ThreadBUnSafe extends Thread {
    private HasSelfPrivateNumUnSafe hasSelfPrivateNumUnSafe;
    public ThreadBUnSafe(HasSelfPrivateNumUnSafe hasSelfPrivateNumUnSafe){
        super();
        this.hasSelfPrivateNumUnSafe = hasSelfPrivateNumUnSafe;
    }
    public void run(){
        super.run();
        hasSelfPrivateNumUnSafe.addI("b");
    }
}
