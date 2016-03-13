package decorator;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class FileLogger implements ILogger {

    public void log(String msg) {
        DataOutputStream dos = null;
        try{
            dos = new DataOutputStream(new FileOutputStream("d:\\log.txt",true));
            dos.writeByte(Integer.parseInt(msg + System.lineSeparator()));
            dos.close();
        }catch (Exception e){

        }
    }
}
