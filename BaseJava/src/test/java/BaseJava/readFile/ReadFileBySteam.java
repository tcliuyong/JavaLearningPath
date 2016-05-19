package BaseJava.readFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by liuyong on 2016/5/19.
 */
public class ReadFileBySteam {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\2.txt");
        int n = 12;
        byte buffer[] = new byte[n];
        while ((fileInputStream.read(buffer, 0, n) != -1) && (n > 0)){
            System.out.println(new String(buffer));
        }
        System.out.println();
        fileInputStream.close();
    }
}
