package BaseJava.mkfile;

/**
 * Created by liuyong on 2016/3/7.
 */
public class Main {
    static final String FILENAME = "file.txt";
    static final String CHARSET = "utf-8";
    public static void main(String[] args) {
        GetDater getDater = new GetDater();
        String path = Main.class.getResource("/").getPath() + FILENAME;
       // String s = getDater.getDataFile(path, CHARSET);
       // System.out.println(s);
        SetDater setDater = new SetDater();
        setDater.writeContentInFile(path,"sd算法");
    }
}
