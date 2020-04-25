import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
/**<applet code=Ex_bg width=500 height=500>
</applet>
*/
public class Ex_bg extends Applet implements ActionListener
{
	Label L1;
	Button B1,B2,B3;
	public void init()
	{
		L1=new Label("Select color");
		B1=new Button("RED");
		B2=new Button("GREEN");
		B3=new Button("Blue");
		add(L1);
		add(B1);
		add(B2);
		add(B3);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			setBackground(Color.red);
		}
		else if(ae.getSource()==B2)
		{
			setBackground(Color.green);
		}
		else
		{
			setBackground(Color.blue);
		}
		repaint();
	}
	
}
 