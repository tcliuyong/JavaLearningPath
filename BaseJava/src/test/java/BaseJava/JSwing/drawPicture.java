package BaseJava.JSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class drawPicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawFrame frame=new drawFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class drawFrame extends JFrame
{
	public drawFrame()
	{
		setTitle("test");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		drawPanel panel=new drawPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=500; 
	public static final  int DEFAULT_HEIGHT=500; 
}
class drawPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		double leftX=100;
		double topY=100;
		double width=200;
		double height=150;
		Rectangle2D rect=new Rectangle2D.Double(leftX, topY, width, height);
		g2.setPaint(Color.RED);
	//	g2.draw(rect);
		g2.fill(rect);
		
		Ellipse2D ellipse= new Ellipse2D.Double();
		ellipse.setFrame(rect);
		//g2.draw(ellipse);
		g2.setPaint(new Color(0,128,128));
		g2.fill(ellipse);
		
		double centerX=rect.getCenterX();
		double centerY=rect.getCenterY();
		double radius=150;
		Ellipse2D circle=new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX+radius, centerY+radius);
		g2.draw(circle);
		
		
	}
}