package BaseJava.craws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PageTool {
	public static String getPage(String strURL){   
        String temp = null;   
        String res="";
        try{   
            URL url = new URL(strURL);   
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();   
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());   
            BufferedReader br = new BufferedReader(isr);   
            while((temp = br.readLine()) != null){   
                //System.out.println(temp);
            	if(temp.contains("name") || temp.contains("lat") || temp.contains("lng"))
            	{
            		res=res+temp+"\n";          		
            	}
         
        			//System.out.println(temp.substring(0, 3));
            	
            }      
            br.close();   
            isr.close();   
        }catch(Exception e){   
            e.printStackTrace();   
        }  
        //System.out.println(res);
        return res;
    }   
    

}
