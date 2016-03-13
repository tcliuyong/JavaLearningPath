package bridge;

/**
 * Created by liuyong on 15-11-23.
 */

/**
 * 如果要添加一个新的事物就直接继承AbstractThing 添加新的邮寄类别 只需要在IPost
 * 种派生一个类
 */
public class Main {
    public static void main(String[] args) {
        IPost p = new SimplePost();
        Letter letter = new Letter(p);
        letter.post();
    }
}
