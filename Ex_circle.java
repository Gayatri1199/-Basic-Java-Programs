import java.applet.*;
import java.awt.*;
/**
<applet code=Ex_circle height=500 width=500>
</applet>
*/
public class Ex_circle extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(100,100,300,300);
		g.setColor(Color.black);
		g.fillOval(180,160,50,50);
		g.fillOval(270,160,50,50);
		g.drawOval(100,100,300,300);//face
		g.drawOval(180,160,50,50);//eye1
		g.drawOval(270,160,50,50);//eye2
		g.drawLine(250,210,250,280);//nose
		g.drawArc(220,300,70,50,0,-180);//smile
		
	}
}