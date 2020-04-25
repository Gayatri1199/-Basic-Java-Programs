import java.applet.Applet;
import java.awt.Choice;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Ex_dropdown" width=500 height=500>
</applet>
*/
public class Ex_dropdown extends Applet implements ItemListener
{
	Choice language;
	String s="";
	public void init()
	{
		language=new Choice();
		language.addItem("Java");
		language.addItem("C++");
		language.addItem("C");
		language.addItem("JS");
		language.addItem("SQL");
		language.addItemListener(this);
		add(language);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		s=language.getSelectedItem();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Language Started"+s,250,300);
	}
}
 