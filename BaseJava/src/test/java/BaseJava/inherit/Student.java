package BaseJava.inherit;

/**
 * Created by liuyong on 2016/5/19.
 */
public class Student extends Person {
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                '}';
    }
}
