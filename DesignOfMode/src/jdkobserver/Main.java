package jdkobserver;

import observer.*;

import java.util.Observer;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        Observer obj = new OneObserver();
        Subject s = new Subject();
        s.addObserver(obj);
        s.setData("hello");
    }
}
