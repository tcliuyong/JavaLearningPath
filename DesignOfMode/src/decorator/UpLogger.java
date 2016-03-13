package decorator;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class UpLogger extends Decorator{
    public UpLogger(ILogger logger){
        super(logger);
    }
    public void log(String msg){
        msg = msg.toLowerCase();
        logger.log(msg);
    }
}
