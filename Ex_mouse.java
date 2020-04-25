import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Ex_mouse" width="400" height="400">
</applet>
*/
public class Ex_mouse extends Applet implements MouseMotionListener
{
	int x,y;
	String str="";
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(str,500,500);
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		str="Mouse moved="+x+","+y;
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
	
	}
}