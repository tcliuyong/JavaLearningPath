package builder.obj;

import builder.product.Product;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public interface IBuild {
    void createHat();
    void createCoat();
    Product composite();
}
