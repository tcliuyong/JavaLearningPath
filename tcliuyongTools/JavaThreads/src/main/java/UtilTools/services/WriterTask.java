package UtilTools.services;

import UtilTools.beans.Event;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by liuyong on 16-1-26.
 */
public class WriterTask implements Runnable {

    private Deque<Event> deque;
    public WriterTask(Deque<Event> deque){
        this.deque =deque;
    }
    @Override
    public void run() {

        for(int i = 1; i < 100; i++){
            Event event = new Event();
            event.setNow(new Date());
            event.setEvent(String.format("The thread %s has generated an event", Thread.currentThread().getId()));
            deque.add(event);
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
