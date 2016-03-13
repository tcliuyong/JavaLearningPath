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
        setChanged();//���ø������ݱ�־
        notifyObservers(null);//֪ͨ����Ĺ۲���
    }

    private String data;
}
