import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_button1 height=500 width=500></applet>
*/
public class Ex_button1 extends Applet implements ActionListener
{
	Button B1,B2;
	Label L1;
	String S,str="";
	public void init()
	{
		L1=new Label("Name:");
		B1=new Button("OK");
		B2=new Button("CANCEL");
		add(L1);
		add(B1);
		add(B2);
		B1.addActionListener(this);
		B2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			S=B1.getLabel();
			B2.setLabel(S);
			B2.setEnabled(false);
			str="OK CLICKED";
		}
		else
		{
			str="CANCEL CLICKED";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
	}
}
	
