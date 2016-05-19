package BaseJava.XML;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXUrl {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String url;
		if(args.length==0)
		{
			url="http://www.w3c.org";
			System.out.println("Using "+url);
			
		}
		else
		{
			url=args[0];
		}
		DefaultHandler handler=new DefaultHandler()
		{
			public void startElement(String namespaceURI,String lname,String qname,Attributes attrs)
			{
				if(lname.equalsIgnoreCase("a")&&attrs!=null)
				{
					for(int i=0;i<attrs.getLength();i++)
					{
						String aname=attrs.getLocalName(i);
						if(aname.equalsIgnoreCase("href"))
							System.out.println(attrs.getValue(i));
					}
				}
			}
		};
		SAXParserFactory factory=SAXParserFactory.newInstance();
		factory.setNamespaceAware(true);
		SAXParser saxParser=factory.newSAXParser();
		InputStream in=new URL(url).openStream();
		saxParser.parse(in, handler);
	}

}
