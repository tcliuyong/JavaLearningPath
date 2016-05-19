package BaseJava.inherit;

/**
 * Created by liuyong on 2016/5/19.
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(11);
        p.setName("test");
        Student s = new Student();
        s.setName("test1");
        s.setAge(12);
        s.setNo(123);
        System.out.println(s.getName());
        System.out.println(p.getName());
    }
}
