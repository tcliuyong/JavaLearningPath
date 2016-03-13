package visitor;

/**
 * Created by liuyong on 15-11-23.
 */

import java.util.concurrent.TransferQueue;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        IVisitor v = new CenterVisitor();
        Triangle t = new Triangle(0,0,2,0,0,2);
        Point pt = (Point) t.accept(v);
        System.out.println(pt.x +"\t" + pt.y);
    }
}
