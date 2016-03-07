package BaseJava.mkfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liuyong on 2016/3/7.
 */
public class SetDater {
    public void writeContentInFile(String filename, String content){
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(new File(filename));
            byte[] contents = content.getBytes();
            fileOutputStream.write(contents);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
