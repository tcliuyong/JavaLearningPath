package visitor;

/**
 * Created by liuyong on 15-11-23.
 */
public interface IShape {
    float getArea();
    float getLength(); //明确的需求
    Object accept(IVisitor v);//可拓展的需求
}
