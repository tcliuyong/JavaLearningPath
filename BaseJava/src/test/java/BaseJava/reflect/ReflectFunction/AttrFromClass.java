package BaseJava.reflect.ReflectFunction;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by liuyong on 2016/3/7.
 */
public class AttrFromClass {
    Logger logger = Logger.getLogger(AttrFromClass.class);
    public ArrayList getAttrFromClass(String className){
        ArrayList attrList = new ArrayList();
        try {
            Class clazz = Class.forName(className);
            Field[] fields = clazz.getDeclaredFields();
            for(Field f : fields){
                attrList.add(f.getName());//获取类型
            }
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage());
        }
        return attrList;
    }
}
