package BaseJava.JSwingEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class plaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plafframe Bt=new plafframe();
		Bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Bt.setVisible(true);
	}

}

class plafframe extends JFrame
{
	public plafframe()
	{
		setTitle("plaf");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		plafPanel panel=new plafPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=300; 
	public static final  int DEFAULT_HEIGHT=200; 
}
class plafPanel extends JPanel
{
	public plafPanel ()
	{
		UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
		for(UIManager.LookAndFeelInfo info: infos)
			makeButton(info.getName(),info.getClassName());
	}
	
	void makeButton(String name,final String plafName)
	{
		JButton button=new JButton(name);
		add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			
				
					try
					{
						UIManager.setLookAndFeel(plafName);
						SwingUtilities.updateComponentTreeUI(plafPanel.this);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				
				// TODO Auto-generated method stub
				
			}
		});
	}
}

