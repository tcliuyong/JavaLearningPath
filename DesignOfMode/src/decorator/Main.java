package decorator;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ILogger existobj = new FileLogger();
        ILogger newobj = new XMLLogger(existobj);
        String s[] = {"how","are","you"};
        for(int i = 0 ; i < s.length; i++){
            newobj.log(s[i]);
            Thread.sleep(1000);
        }
        System.out.println("end");
    }
}
