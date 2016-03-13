package bridge;

/**
 * Created by liuyong on 15-11-23.
 */
abstract class AbstractThing {
    private IPost obj;
    public AbstractThing(IPost post){
        this.obj = post;
    }
    public void post(){
        obj.post();
    }
}
