package BaseJava.reflect.ReflectFunction;

import BaseJava.reflect.model.Person;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/7.
 */
public class MethodFromClassDemo {
    Logger logger = Logger.getLogger(MethodFromClassDemo.class);
    public void exeMethodFromClass() throws InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        person.setAge(10);
        person.setName("tcliuyong");
        person.setBrithday(new Date());
        Class personClass = (Class) person.getClass();
        Method[] methods = personClass.getMethods();
        for(int i = 0; i <methods.length; i++){
            if(methods[i].getName().startsWith("get")){
                logger.info(methods[i].getName());
                logger.info(methods[i].invoke(person));
            }
        }
    }
}
