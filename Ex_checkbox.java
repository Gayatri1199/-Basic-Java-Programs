import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**<applet code=Ex_checkbox width=500 height=500>
</applet>
*/
public class Ex_checkbox extends Applet implements ItemListener
{
	Checkbox c1,c2;
	String s1="",s2="";
	public void init()
	{
		c1=new Checkbox("A");
		c2=new Checkbox("B");
		c1.addItemListener(this);
		c2.addItemListener(this);
		add(c1);
		add(c2);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		s1="Checkbox 1="+c1.getState();
		s2="Checkbox 2="+c2.getState();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s1,200,200);
		g.drawString(s2,300,200);
	}
}

