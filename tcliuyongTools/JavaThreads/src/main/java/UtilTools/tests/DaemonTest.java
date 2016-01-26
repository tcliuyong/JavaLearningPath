package UtilTools.tests;

import UtilTools.beans.Event;
import UtilTools.services.CleanerTask;
import UtilTools.services.WriterTask;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by liuyong on 16-1-26.
 */
public class DaemonTest {
    public static void main(String[] args) {
        Deque<Event> deque = new ArrayDeque<Event>();
        WriterTask writerTask = new WriterTask(deque);
        for(int i = 0; i < 3; i++){
            Thread thread = new Thread(writerTask);
            thread.start();
        }
        CleanerTask cleanerTask = new CleanerTask(deque);
        cleanerTask.start();
    }

}
