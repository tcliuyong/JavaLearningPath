package BaseJava.craws;
  
import java.io.BufferedReader;   
import java.io.InputStreamReader;   
import java.net.HttpURLConnection;   
import java.net.URL;   
  
/*@src  http://eric-619.javaeye.com/blog/693741*/  
public class Spider{   
    public static void main(String[] args){   
        new Spider().methodPa("http://passport.cnblogs.com/login.aspx?ReturnUrl=http%3A%2F%2Fwww.cnblogs.com%2F");   
    }   
       
    public String methodPa(String strURL){   
        String temp = null;   
        try{   
            URL url = new URL(strURL);   
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();   
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());   
            BufferedReader br = new BufferedReader(isr);   
            while((temp = br.readLine()) != null){   
                System.out.println(temp);   
            }      
            br.close();   
            isr.close();   
        }catch(Exception e){   
            e.printStackTrace();   
        }  
        return temp;
    }   

 }  

