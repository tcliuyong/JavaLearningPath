package BaseJava.readFile;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by liuyong on 2016/5/19.
 */
public class SequenceInputStreamDemo {
    private Vector listFileNames = new Vector();
    private Vector fileList = new Vector();
    private void getFileNames(){
        String fileName = "";
        System.out.println("Input File Name(one in a line)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                fileName = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if((fileName.equals("over"))){
                break;
            }
            listFileNames.add(fileName);
        }
    }
    private boolean createFileList(){
        Enumeration list = listFileNames.elements();
        while (list.hasMoreElements()){
            String fileName = (String) list.nextElement();
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            fileList.add(inputStream);
        }
        return true;
    }
    private void mergeFiles(){
        try {
            OutputStream outputStream = new FileOutputStream("D:\\111.txt");
            SequenceInputStream inputStream = new SequenceInputStream(fileList.elements());
            byte[] buf = new byte[1024];
            int len = 0;
            while((len=inputStream.read(buf))!=-1)
            {
                outputStream.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
