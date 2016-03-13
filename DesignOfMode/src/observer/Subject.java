package observer;

import java.util.Vector;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Subject implements ISubject{
    private Vector<IObserver> vec = new Vector();
    private String data;

    public Vector<IObserver> getVec() {
        return vec;
    }

    public void setVec(Vector<IObserver> vec) {
        this.vec = vec;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void register(IObserver obs) {
        vec.add(obs);
    }

    public void unregister(IObserver obs) {
        if(vec.contains(obs)){
            vec.remove(obs);
        }
    }
//����֪ͨ�۲��߽���������Ӧ
    public void notifyObservers() {
        for(int i = 0; i < vec.size(); i++){
            IObserver obs = vec.get(i);
            obs.refresh(data);
        }
    }
}
