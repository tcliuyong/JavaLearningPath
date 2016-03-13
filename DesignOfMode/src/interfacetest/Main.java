package interfacetest;

/**
 * Created by lyong.liu on 2015/11/21.
 */
public class Main {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 0, 11};
        Algo<Integer> algo = new Algo<Integer>();
        ILess<Integer> iLess = new ILess<Integer>() {
            public boolean less(Integer x, Integer y) {
                return x >= y;
            }
        };
        System.out.println(algo.getMax(arr, iLess));
    }
}
