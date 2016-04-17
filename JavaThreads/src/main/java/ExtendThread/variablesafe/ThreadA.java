package ExtendThread.variablesafe;

/**
 * Created by liuyong on 2016/4/16.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }
    public void run(){
        super.run();
        hasSelfPrivateNum.addI("a");
    }
}
