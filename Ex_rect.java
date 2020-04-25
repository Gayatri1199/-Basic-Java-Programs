import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_rect height="500" width="500">
</applet>
*/
public class Ex_rect extends Applet implements KeyListener
{
	int i,y,x;
	public void init()
	{
		addKeyListener(this);
	}
	public void paint(Graphics g )
	{
		g.drawRect(200,400,200,50);//rectangle
		g.drawRect(250,350,100,50);//square
		g.drawOval(250,450,20,20);//left circle
		g.drawOval(350,450,20,20);//right circle
		g.drawLine(250,350,200,400);
		g.drawLine(350,350,400,400);
	}
	public void keyPressed(KeyEvent ke)
	{
			i=ke.getKeyCode();
			switch(i)
			{
				case KeyEvent.VK_DOWN:
					y=y+5;
					break;
					
				case KeyEvent.VK_U:
					y=y-5;
					break;
					
				case KeyEvent.VK_LEFT:
					x=x-5;
					break;
					
				case KeyEvent.VK_RIGHT:
					x=x+5;
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