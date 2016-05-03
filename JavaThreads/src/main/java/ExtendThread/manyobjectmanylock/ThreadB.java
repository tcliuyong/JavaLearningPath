package ExtendThread.manyobjectmanylock;
import ExtendThread.manyobjectmanylock.*;
import ExtendThread.manyobjectmanylock.HasSelfPrivateNum;

/**
 * Created by liuyong on 2016/4/16.
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }
    @Override
    public void run(){
        super.run();
        hasSelfPrivateNum.addI("b");
    }
}
