package UtilTools.beans;

import java.util.Date;

/**
 * Created by liuyong on 16-1-26.
 */
public class Event {
    private Date now;
    private String event;

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
