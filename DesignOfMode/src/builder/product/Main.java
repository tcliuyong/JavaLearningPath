package builder.product;

import builder.obj.IBuild;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) {
        IBuild IBuild = new BuildProduct();
        Director director = new Director(IBuild);
        Product p = director.build();

    }
}
