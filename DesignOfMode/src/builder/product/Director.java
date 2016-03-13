package builder.product;


import builder.obj.IBuild;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Director {
    private IBuild IBuild;
    public Director(IBuild IBuild){
        this.IBuild = IBuild;
    }
    public Product build(){
        IBuild.createHat();
        IBuild.createCoat();
        return IBuild.composite();
    }
}
