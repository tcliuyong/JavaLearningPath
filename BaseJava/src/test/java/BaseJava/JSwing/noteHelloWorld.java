package BaseJava.JSwing;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class noteHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloWorld h=new helloWorld();
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setVisible(true);
	}

}
class helloWorld extends JFrame
{
	public helloWorld()
	{
		setTitle("hello world");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		noteHelloWorldPanel panel=new noteHelloWorldPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=300; 
	public static final  int DEFAULT_HEIGHT=200; 
}
class noteHelloWorldPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("hello", x,y);
	}
	public static final int x=50; 
	public static final  int y=50; 
}