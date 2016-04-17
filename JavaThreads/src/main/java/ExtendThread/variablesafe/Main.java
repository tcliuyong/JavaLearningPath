package ExtendThread.variablesafe;

/**
 * Created by liuyong on 2016/4/16.
 */
public class Main {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNumUnSafe hasSelfPrivateNumUnSafe = new HasSelfPrivateNumUnSafe();
        ThreadAUnSafe threadA = new ThreadAUnSafe(hasSelfPrivateNumUnSafe);
//        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadBUnSafe threadB = new ThreadBUnSafe(hasSelfPrivateNumUnSafe);
//        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
