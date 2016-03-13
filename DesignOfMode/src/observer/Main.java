package observer;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        IObserver obs = new Object();
        Subject subject = new Subject();
        subject.register(obs);
        subject.setData("hello");
        subject.notifyObservers();
    }
}
