package BaseJava.readFile;
import java.io.IOException;
import java.io.PushbackInputStream;
/**
 * Created by liuyong on 2016/5/19.
 */
public class PushBackInputStreamDemo {
    public static void main(String[] args) throws IOException {
        PushBackInputStreamDemo pushBackInputStreamDemo = new PushBackInputStreamDemo();
        pushBackInputStreamDemo.readAndPrint();
    }
    private void readAndPrint() throws IOException {
        PushbackInputStream f = new PushbackInputStream(System.in, 3);
        int c, c1,c2;
        while ((c = f.read()) != 'q'){
            switch (c){
                case '.':
                    System.out.print((char) c);
                    if((c1 = f.read()) == '0'){
                        if((c2 = f.read()) == '0') {
                            System.out.print("**");
                        }else {
                            f.unread(c2);
                            f.unread(c1);
                        }
                    }else {
                        f.unread(c1);
                    }
                    break;
                default:
                    System.out.print((char) c);
                    break;
            }
        }
        f.close();
    }
}
