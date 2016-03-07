package BaseJava.reflect.ReflectMain;

import BaseJava.reflect.ReflectFunction.AttrFromClass;
import BaseJava.reflect.ReflectFunction.MethodFromClassDemo;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * Created by liuyong on 2016/3/7.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList attrList = new ArrayList();
        AttrFromClass getAttrFromClass = new AttrFromClass();
        attrList = getAttrFromClass.getAttrFromClass("BaseJava.reflect.model.Person");
        for(Object o : attrList){
            System.out.println(o.toString());
        }
        MethodFromClassDemo methodFromClass = new MethodFromClassDemo();
        methodFromClass.exeMethodFromClass();
    }
}
