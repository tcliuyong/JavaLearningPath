package jdkobserver;

import observer.*;

import java.lang.Object;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class OneObserver implements Observer{
    public void update(Observable o, Object arg) {
        Subject subject = (Subject)o;
        System.out.println("The data is :" + subject.getData());
    }
}
