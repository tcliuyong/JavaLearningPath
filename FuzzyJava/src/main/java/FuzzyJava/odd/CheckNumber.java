package FuzzyJava.odd;

/**
 * Created by liuyong on 2016/3/3.
 */
/*
如何判断一个数字是不是奇数 是否能用以下的形式
i % 2 == 1
如果 i 是负数怎么办？
 */
public class CheckNumber {
    public boolean isOdd(int number){
        return (number & 1) != 0;
    }
}
