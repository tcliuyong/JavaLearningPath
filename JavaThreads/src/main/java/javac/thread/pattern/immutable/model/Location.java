package javac.thread.pattern.immutable.model;

/**
 * Created by lyong.liu on 2016/12/4.
 */
//利用final属性进行同步  不可变对象
public class Location {
    private final double x;
    private final double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
