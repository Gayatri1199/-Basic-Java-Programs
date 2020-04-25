import java.applet.*;
import java.awt.*;
/**<applet code=Ex_color height="500" width="500">
</applet>
*/
public class Ex_color extends Applet
{
		public void init()
		{
			setBackground(Color.YELLOW);
			setForeground(Color.RED);
		}
		public void paint(Graphics g)
		{
			g.drawString("Hello",100,200);
			g.setColor(Color.BLUE);
			g.drawString("hey!!",100,300);
		}
}