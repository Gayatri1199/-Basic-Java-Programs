import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=Ex_key height=500 width=500></applet>
*/
public class Ex_key extends Applet implements KeyListener
{
	char h;
		public void init()
		{
			addKeyListener(this);
		}
		public void paint(Graphics g)
		{
			g.drawString("KeyPressed="+h,200,200);
		}
		public void keyTyped(KeyEvent ke)
		{
		}
		public void keyPressed(KeyEvent ke)
		{
			h=ke.getKeyChar();
			repaint();
		}
		public void keyReleased(KeyEvent ke)
		{
		}
}
