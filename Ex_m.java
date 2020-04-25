import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_m height=500 width=500>
</applet>
*/
public class Ex_m extends Applet implements MouseListener,MouseMotionListener
{
	int x1,x2,y1,y2;
	Graphics g;
	public void init()
	{
		g=getGraphics();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
		
	}
	public void mouseDragged(MouseEvent me)
	{
		x2=me.getX();
		y2=me.getY();
		g.drawLine(x1,y1,x2,y2);
		x1=x2;
		y1=y2;
		
	}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void mouseClicked(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
	}
	public void keyReleased()
	{
	}
	public void keyTyped()
	{
	}
}