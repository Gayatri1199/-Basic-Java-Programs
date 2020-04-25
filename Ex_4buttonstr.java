import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**<applet code=Ex_4buttonstr width=500 height=500>
</applet>
*/
public class Ex_4buttonstr extends Applet implements ActionListener
{
	Button B1,B2,B3,B4;
	int x,y;
	String s="Muje idhr udhr karo!!";
	public void init()
	{
		x=200;
		y=200;
		B1=new Button("LEFT");
		B2=new Button("RIGHT");
		B3=new Button("Down");
		B4=new Button("UP");
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(s,x,y);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			x=x-10;
		}
		else if(ae.getSource()==B2)
		{
			x=x+10;
		}
		else if(ae.getSource()==B3)
		{
			y=y+10;
		}
		else
		{
			y=y-10;
		}
		repaint();
	}
} 