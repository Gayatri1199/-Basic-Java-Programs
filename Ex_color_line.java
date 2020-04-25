import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_color_line height=500 width=500>
</applet>
*/
public class Ex_color_line extends Applet implements MouseMotionListener,MouseListener
{
	int x,y,x1,y1,x2,y2;
	Graphics g;
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
		g=getGraphics();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(30,30,50,50);
		g.setColor(Color.GREEN);
		g.fillRect(90,30,50,50);
		g.setColor(Color.BLUE);
		g.fillRect(150,30,50,50);
	}
	public void mouseMoved(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
	}
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
	}
	public void mouseDragged(MouseEvent me)
	{
		x2=me.getX();
		y2=me.getY();
		if((x>=30&&x<=80)&&(y>=30&&y<=80))
		{
			g.setColor(Color.RED);
			g.drawLine(x1,y1,x2,y2);
			x1=x2;
			y1=y2;
		}
		else if((x>=90&&x<=140)&&(y>=30&&y<=80))
		{
			g.setColor(Color.GREEN);
			g.drawLine(x1,y1,x2,y2);
			x1=x2;
			y1=y2;
		}
		else if((x>=150&&x<=200)&&(y>=30&&y<=80))
		{
			g.setColor(Color.BLUE);
			g.drawLine(x1,y1,x2,y2);
			x1=x2;
			y1=y2;
		}
		else
		{
			g.drawString("please select some color",350,350);
		}
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
	public void mouseReleased(MouseEvent me)
	{
	}
}
