package BaseJava.XML;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class SAXreadXML {

	public static void main(String[] args) throws Exception {
		File f =new File("D:\\book.xml");
		InputStream input = new FileInputStream(f);
		SaxParseService sax =new SaxParseService();
		 List<Book> books = sax.getBooks(input);  
	      for(Book book : books)
	      {  
	            System.out.println(book.toString());  
	      }  
	}

}
