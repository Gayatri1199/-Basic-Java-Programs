import java.awt.*;
import java.applet.*;
import java.awt.Color;
/**<applet code=First width=500 height=500>
</applet>
*/
public class First extends Applet
{
	String init="";
	String start="";
	String stop="";
	String destroyed="";
	public void paint(Graphics g)
	{
		g.drawSting(init,100,100);
		g.drawSting(start,200,200);
		g.drawSting(stop,300,300);
		g.drawSting(destroyed,400,400);
	)
	public void init()
	{
		init="Initialized";
	}
	public void start()
	{
		start="Started";
	}
	public void stop()
	{
		stop="Stoped";
	}
	public void destroy()
	{
		destroyed="Destroyed";
	}
}