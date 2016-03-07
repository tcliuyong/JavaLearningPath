package BaseJava.reflect.model;

import java.util.Date;

/**
 * Created by liuyong on 2016/3/7.
 */
public class Person {
    private String name;
    private int age;
    private Date brithday;

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        return getBrithday() != null ? getBrithday().equals(person.getBrithday()) : person.getBrithday() == null;

    }
}
