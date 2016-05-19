package BaseJava.XML;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class DomXML {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 File f =new File("D:\\book.xml");
		 InputStream input = new FileInputStream(f);
	     DomParseService dom = new DomParseService();  
	     List<Book> books = dom.getBooks(input);  
	      for(Book book : books)
	      {  
	            System.out.println(book.toString());  
	      }  
	}

}


