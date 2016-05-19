package BaseJava.thread;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Semaphore;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class algorithmAnimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AnimationFrame frame=new AnimationFrame();
		JFrame frame=new AnimationFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class AnimationFrame extends JFrame
{
	public AnimationFrame()
	{
		ArrayPanl panel=new ArrayPanl();
		add(panel,BorderLayout.CENTER);
		Double[] values =new Double[VALUES_LENGTH];
		final Sorter sorter=new Sorter(values, panel);
		JButton runButton=new JButton("run");
		runButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				sorter.setRun();
			}
		});
		JButton setButton=new JButton("Setup");
		setButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				sorter.setStep();
			}
		});
		JPanel buttons=new JPanel();
		buttons.add(runButton);
		buttons.add(setButton);
		add(buttons,BorderLayout.NORTH);
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		for(int i=0;i<values.length;i++)
			values[i]=new Double(Math.random());
		Thread t=new Thread(sorter);
		t.start();
	}
	
	
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=300;
	private static final int VALUES_LENGTH=30;
}
class Sorter implements Runnable
{
	public Sorter(Double[] values,ArrayPanl panel)
	{
		this.values=values;
		this.panel=panel;
		this.gate=new Semaphore(1);//�Ը���������鹹���ź���
		this.run=false;
	}
	public void setRun()
	{
		run=true;
		gate.release();
	}
	public void setStep()
	{
		run=false;
		gate.release();
	}
	public void run()
	{
		Comparator<Double> comp=new Comparator<Double>() {
			
			
			@Override
			public int compare(Double i1, Double i2) {
			panel.setValues(values, i1, i2);
				try
				{
					if(run)
						Thread.sleep(DELAY);
					else 
						gate.acquire();
				}
				catch (InterruptedException exception)
				{
					Thread.currentThread().interrupt();
				}
				
				return i1.compareTo(i2);
			}
		};
		Arrays.sort(values,comp);
		panel.setValues(values,null,null);
	}
	private Double[] values;
	private ArrayPanl panel;
	private Semaphore gate;
	private static final int DELAY=100;
	private boolean run;
}
class ArrayPanl extends JPanel
{
	public void paintComponent(Graphics g)
	{
		if(values == null) return ;
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		int width=getWidth()/values.length;
		for(int i=0;i<values.length;i++)
		{
			double height=values[i]* getHeight();
			Rectangle2D bar = new Rectangle2D.Double(width*i,0,width,height);
			if(values[i]==marked1 || values[i]==marked2)
				g2.fill(bar);
			else
				g2.draw(bar);
		}
		
	}
	public void setValues(Double[] values,Double marked1,Double marked2)
	{
		this.values=values;
		this.marked1=marked1;
		this.marked2=marked2;
		repaint();
	}
	private Double marked1;
	private Double marked2;
	private Double[] values;
}