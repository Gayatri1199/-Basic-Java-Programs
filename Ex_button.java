import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_button height="500" width="500">
</applet>
*/
public class Ex_button extends Applet implements ActionListeners
{
	Button B1,B2;
	String str="";
	public void int()
	{
		B1= new Button("OK");
		B2=new Button("Cancel");
		add(B1);
		add(B2);
		B1.addActionListener(this);
		B2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
				str="ok clicked";
		}
		else
		{
			str="cancel clicked";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
	}
	
}

