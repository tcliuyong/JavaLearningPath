package jdkobserver;

import java.util.Observable;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Subject extends Observable {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setChanged();//设置更新数据标志
        notifyObservers(null);//通知具体的观察者
    }

    private String data;
}
