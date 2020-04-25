import java.applet.*;
import java.awt.*;
public class Gayatri extends Applet
{
	public void paint(Graphics x)
	{
		x.drawOval(100,100,450,450);
		x.drawOval(200,200,80,80);
		x.drawOval(400,200,80,80);
		x.drawLine(200,400,430,400);
		x.drawLine(200,150,200,40);
	}		
}
/*<applet code="Gayatri.class" width="500" height="400">
</applet>*/