package ExtendThread.variablesafe;

/**
 * Created by liuyong on 2016/4/16.
 */
public class ThreadAUnSafe extends Thread {
    private HasSelfPrivateNumUnSafe hasSelfPrivateNumUnSafe;
    public ThreadAUnSafe(HasSelfPrivateNumUnSafe hasSelfPrivateNumUnSafe){
        super();
        this.hasSelfPrivateNumUnSafe = hasSelfPrivateNumUnSafe;
    }
    public void run(){
        super.run();
        hasSelfPrivateNumUnSafe.addI("a");
    }
}
