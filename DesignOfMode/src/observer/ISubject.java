package observer;

/**
 * Created by lyong.liu on 2015/11/22.
 */

/**
 * theme of subject
 */
public interface ISubject {
    void register(IObserver obs);//注册观察者
    void unregister(IObserver obs);//撤销观察者
    void notifyObservers();//通知所有观察者
}
