package BaseJava.readFile;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

public class readZip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zipTestFrame frame=new zipTestFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class zipTestFrame extends JFrame
{
	public zipTestFrame()
	{
		setTitle("read a zip");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		JMenuBar menuBar=new JMenuBar();
		JMenu menu=new JMenu("File");
		JMenuItem openItem=new JMenuItem("open");
		menu.add(openItem);
		openItem.addActionListener(new OpenAction());
		
		JMenuItem exitItem=new JMenuItem("exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		fileText =new JTextArea();
		fileCombo=new JComboBox();
		fileCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				loadZipFile((String) fileCombo.getSelectedItem());
			}
		});
		add(fileCombo,BorderLayout.SOUTH);
		add(new JScrollPane(fileText),BorderLayout.CENTER);
	}
		
	private class OpenAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JFileChooser chooser=new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			ExtensionFileFilter filter=new ExtensionFileFilter();
			filter.addExtension(".zip");
			filter.addExtension(".jar");
			filter.setDescription("ZIP");
			chooser.setFileFilter(filter);
			int r=chooser.showOpenDialog(zipTestFrame.this);
			if(r==JFileChooser.APPROVE_OPTION)
			{
				zipname=chooser.getSelectedFile().getPath();
				scanZipFile();
			}
			
		}
	}
	public void scanZipFile()
	{
		fileCombo.removeAllItems();
		try 
		{
			ZipInputStream zin=new ZipInputStream(new FileInputStream(zipname));
			ZipEntry entry;
			while((entry = zin.getNextEntry())!=null)
			{
				fileCombo.addItem(entry.getName());
				zin.closeEntry();
			}
			zin.close();
		}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
	}
	public void loadZipFile(String name)
	{
		try
		{
			ZipInputStream zin=new ZipInputStream(new FileInputStream(zipname));
			ZipEntry entry;
			fileText.setText("");
			while ((entry=zin.getNextEntry())!=null)
			{
				if(entry.getName().equals(name))
				{
					BufferedReader in =new BufferedReader(new InputStreamReader(zin));
					String line;
					while((line=in.readLine())!=null)
					{
						fileText.append(line);
						fileText.append("\n");
					}
				}
				zin.closeEntry();
			}
			zin.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static final int DEFAULT_WIDTH=400; 
	public static final  int DEFAULT_HEIGHT=300; 
	private JComboBox fileCombo;
	private JTextArea fileText;
	private String zipname;
}

class ExtensionFileFilter extends FileFilter
{
	public void addExtension(String extension)
	{
		if(!extension.startsWith("."))
			extension="."+extension;
		extensions.add(extension.toLowerCase());
	}
	public void setDescription(String aDescription)
	{
		description=aDescription;
	}
	public boolean accept(File f)
	{
		if(f.isDirectory()) return true;
		String name=f.getName().toLowerCase();
		
		for(String e:extensions)
			if(name.endsWith(e)) return true;
		return false;
	}
	private String description="";
	private ArrayList<String> extensions=new ArrayList();
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}





