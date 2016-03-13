package observer;

/**
 * Created by lyong.liu on 2015/11/22.
 */

/**
 * theme of subject
 */
public interface ISubject {
    void register(IObserver obs);//ע��۲���
    void unregister(IObserver obs);//�����۲���
    void notifyObservers();//֪ͨ���й۲���
}
