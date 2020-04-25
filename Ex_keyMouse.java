import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code=Ex_keyMouse height=500 width=500></applet>
*/
public class Ex_keyMouse extends Applet implements KeyListener
{
	String ch="Hello";
	int x;
	int y;
	public void init()
	{
		x=100;
		y=100;
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(ch,x,y);
	}
	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode()==ke.VK_UP||ke.getKeyCode()==ke.VK_W)
		{
			ch="Moving up";
			y=y-5;
			repaint();
		}
		if(ke.getKeyCode()==ke.VK_DOWN||ke.getKeyCode()==ke.VK_S)
		{
			ch="Moving Down";
			y=y+5;
			repaint();
		}
		if(ke.getKeyCode()==ke.VK_RIGHT||ke.getKeyCode()==ke.VK_D)
		{
			ch="Moving Right";
			x=x+5;
			repaint();
		}
		if(ke.getKeyCode()==ke.VK_LEFT||ke.getKeyCode()==ke.VK_A)
		{
			ch="moving left";
			x=x-5;
			repaint();
		}
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void keyTyped(KeyEvent ke)
	{
	}
}
		
	
