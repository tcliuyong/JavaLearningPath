package builder.product;

import builder.obj.IBuild;
import builder.obj.Coat;
import builder.obj.Hat;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class BuildProduct implements IBuild {
    Product p = new Product();
    public void createHat(){
        p.hat = new Hat();
    }
    public void createCoat(){
        p.coat = new Coat();
    }
    public Product composite(){
        return p;
    }
}
