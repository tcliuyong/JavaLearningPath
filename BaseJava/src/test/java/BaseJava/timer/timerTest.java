package BaseJava.timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class timerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener= new TimePrinter();
		Timer t=new Timer(1000,listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now=new Date();
		System.out.println("At the tone,time is "+now);
		Toolkit.getDefaultToolkit().beep();//发出一声响铃
	}
}
