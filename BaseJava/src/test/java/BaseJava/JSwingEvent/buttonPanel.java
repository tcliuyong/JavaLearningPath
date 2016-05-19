package BaseJava.JSwingEvent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class buttonPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTframe Bt=new BTframe();
		Bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Bt.setVisible(true);
	}

}

class BTframe extends JFrame
{
	public BTframe()
	{
		setTitle("hello world");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		BtPanel panel=new BtPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=300; 
	public static final  int DEFAULT_HEIGHT=200; 
}
class BtPanel extends JPanel
{
	public BtPanel ()
	{
		JButton yButton=new JButton("yellow");
		JButton bButton=new JButton("blue");
		JButton rButton=new JButton("red");
		add(yButton);
		add(bButton);
		add(rButton);
		
		ColorAction yActon=new ColorAction(Color.YELLOW);
		ColorAction rActon=new ColorAction(Color.RED);
		ColorAction bActon=new ColorAction(Color.BLUE);
		yButton.addActionListener(yActon);
		rButton.addActionListener(rActon);
		bButton.addActionListener(bActon);
	}
}

class ColorAction implements ActionListener
{
	public ColorAction(Color c)
	{
		backgroundColor=c;
	}
	public void actionPerformed(ActionEvent event)
	{
		System.out.println(1);
		//setBackground(backgroundColor);
	}
	private Color backgroundColor;
}