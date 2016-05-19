package BaseJava.JSwing;

import javax.swing.JFrame;

public class simpleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFrameTest frame=new SimpleFrameTest();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
class SimpleFrameTest extends JFrame
{
	public SimpleFrameTest()
	{
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
	}
	public static final int DEFAULT_WIDTH=300; 
	public static final  int DEFAULT_HEIGHT=200; 
}