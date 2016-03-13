package decorator;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Decorator implements ILogger {
    protected  ILogger logger;
    Decorator(ILogger logger){
        this.logger = logger;
    }
    public void log(String msg) {

    }
}
