import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=MouseEx height=500 width=500>
</applet>
*/
public class MouseEx extends Applet implements MouseMotionListener
{
	int x;
	int y;
	String str="";
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(str,x,y);
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		str="Bye!! Everyone";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		str="Hello world!!";
		repaint();
	}
} 