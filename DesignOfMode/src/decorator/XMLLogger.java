package decorator;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class XMLLogger extends Decorator {
    XMLLogger(ILogger logger) {
        super(logger);
    }
    public void log(String msg){
        String s = "sdfASDFSDF";
        logger.log(s);
    }
}
