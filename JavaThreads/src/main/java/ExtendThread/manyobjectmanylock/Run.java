package ExtendThread.manyobjectmanylock;
import ExtendThread.manyobjectmanylock.*;
/**
 * Created by liuyong on 2016/4/17.
 */
public class Run {
    HasSelfPrivateNum hasSelefPrivateNum1 = new HasSelfPrivateNum();
    HasSelfPrivateNum hasSelefPrivateNum2 = new HasSelfPrivateNum();
    ThreadA athread = new ThreadA(hasSelefPrivateNum1);
    ThreadB bthread = new ThreadB(hasSelefPrivateNum2);

}
