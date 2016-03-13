package state;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Context {
    private IState state;
    public void setState(IState state){
        this.state = state;
    }
    public void manage(){
        state.getState();
    }
}
