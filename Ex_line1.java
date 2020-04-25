import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_line1 heigh500 width=500>
</applet>
*/
public class Ex_line1 extends implements MouseListener,MouseMotionListener
{
	int x1,y1,x2,y2;
	Graphics g;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		g=getGraphics();
	}
	public void mouseMoved(MouseEvent me)
	{
		x1=me.getX();
		x2=me.getY();
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
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseClicked(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
}