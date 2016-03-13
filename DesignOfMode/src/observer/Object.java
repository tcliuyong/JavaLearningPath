package observer;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Object implements IObserver{
    public void refresh(String data) {
        System.out.println("I hava received the data:" + data);
    }
}
