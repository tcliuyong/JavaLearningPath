package interfacetest;

/**
 * Created by lyong.liu on 2015/11/21.
 */
public class Algo<T> {
    public T getMax(T t[], ILess<T> cmp) {
        T MaxValue = t[0];
        for (int i = 1; i < t.length; i++) {
            if (cmp.less(t[i], MaxValue)) {
                MaxValue = t[i];
            }
        }
        return MaxValue;
    }
}
