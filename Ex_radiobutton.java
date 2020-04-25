import java.applet.*;
ppimport java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
/**<applet code=Ex_radiobutton width=500 height=500>
</applet>
*/
public class Ex_radiobutton extends Applet implements ActionListener,ItemListener
{
	Label L1;
	Checkbox R1,R2;
	Button B1,B2,B3,B4;
	public void init()
	{
		L1=new Label("Hello");
		R1=new Checkbox("FOREGROUND");
		B1=new Button("RED");
		B2=new Button("GREEN");
		R2=new Checkbox("BACKGROUND");
		B3=new Button("BLUE");
		B4=new Button("YELLOW");
	
		add(L1);
		add(R1);
		add(B1);
		add(B2);
		add(R2);
		add(B3);
		add(B4);
	
		R1.addItemListener(this);
		R2.addItemListener(this);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(R1.getState()==true)
		{
			if(ae.getSource()==B1)
			{
				L1.setForeground(Color.RED);
			}
			else
			{
				L1.setForeground(Color.RED);
			}
		}
		if(R2.getState()==true)
		{
			if(ae.getSource()==B3)
			{
				setBackground(Color.BLUE);
			}
			else
			{
				setBackground(Color.YELLOW);
			}
			
		}
	}
	
	
}
