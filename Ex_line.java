import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_line height=500 width=500>
</applet>
*/
public class Ex_line extends Applet implements KeyListener
{
	int x1,x2,y1,y2,i;
	public void init()
	{
		x1=100;
		x2=200;
		y1=100;
		y2=200;
		addKeyListener(this);
	}
		
	public void paint(Graphics g)
	{
		g.drawLine(x1,y1,x2,y2);
	}
	public void keyPressed(KeyEvent ke)
	{
			i=ke.getKeyCode();
			switch(i)
			{
				case KeyEvent.VK_DOWN:
					y1=y1+5;
					y2=y2+5;
					break;
					
				case KeyEvent.VK_UP:
					y1=y1-5;
					y2=y2-5;
					break;
					
				case KeyEvent.VK_LEFT:
					x1=x1-5;
					x2=x2-5;
					break;
					
				case KeyEvent.VK_RIGHT:
					x1=x1+5;
					x2=x2+5;
					break;
			}
			repaint();
			
			
	}

public  void keyTyped(KeyEvent ke)
{
}
public void keyReleased(KeyEvent ke)
{
}
	
}	