package BaseJava.craws;
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
    
public class httpLogin {     
     

    public static void main(String[] args) throws IOException {     

    	String LOGIN_URL="http://passport.cnblogs.com/login.aspx?ReturnUrl=http%3A%2F%2Fhome.cnblogs.com%2F";
            CookieHandler.setDefault(new CookieManager());
            // ��ȡ��¼ҳ��
            String page = getPage(LOGIN_URL);
            // �ӵ�¼ȥȡ��������������˺ź�����
            Document doc = Jsoup.parse(page);
            // ȡ��¼���
            Element loginform = doc.getElementById("frmLogin");
            Elements inputElements =loginform.getElementsByTag("input");
            List<String> paramList = new ArrayList<String>();
            System.out.println(inputElements.toString());
            
            
            for (Element inputElement : inputElements) {
                String key = inputElement.attr("name");
                String value = inputElement.attr("value");
                if (key.equals("tbUserName"))
                    value = "liuyong1255";
                	//System.out.println(value+"2");
                else if (key.equals("tbPassword"))
                    value = "ly125512240";
                	
                paramList.add(key + "=" + URLEncoder.encode(value, "UTF-8"));
            }
            // ��װ�������
            StringBuilder para = new StringBuilder();
            for (String param : paramList) {
                if (para.length() == 0) {
                    para.append(param);
                } else {
                    para.append("&" + param);
                }
            }
          //System.out.println(para.toString());
            // POST���͵�¼
            String result =httpRequest.sendPost(LOGIN_URL, para.toString());
            if (!result.contains("followees")) {
                Object cookies = null;
                System.out.println("��¼ʧ��");
            } else
                System.out.println("��¼�ɹ�");
            
            Document docTest = Jsoup.parse(result);
            //System.out.println(result);
            List<String> l=new ArrayList<String>();
            l=getOnePageFriends(docTest);
            System.out.println(l);
                 
        }
    public static List<String> getOnePageFriends(Document doc) {
        List<String> firends = new ArrayList<String>();
        Elements inputElements = doc.getElementsByClass("right_user_info");
        for (Element inputElement : inputElements) {
            Elements links = inputElement.getElementsByTag("a");
            for (Element link : links) {
                //��href�н������û�id
                String href = link.attr("href");
                firends.add(href.substring(3, href.length() - 1));
            }
        }
        return firends;
    }
  
    public static String getPage(String strURL){   
        String temp = null;   
        String res=null;
        try{   
            URL url = new URL(strURL);   
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();   
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());   
            BufferedReader br = new BufferedReader(isr);   
            while((temp = br.readLine()) != null){   
                //System.out.println(temp); 
            	res=res+temp;
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
