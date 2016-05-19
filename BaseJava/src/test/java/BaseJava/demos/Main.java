package BaseJava.demos;

/**
 * Created by liuyong on 2016/5/19.
 */
public class Main {
    @comment(description="test",es=1)
    public static void add(){
        StaticClass.a += 100;
    }
    public static void main(String[] args) {
        add();
        System.out.println(StaticClass.a);

    }
}
