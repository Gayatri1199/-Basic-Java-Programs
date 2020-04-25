import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_font height=500 width=500>
</applet>
*/
public class Ex_font extends Applet implements ActionListener
{
	Button B1,B2,B3,B4;
	Font f;
	String s="DO SOME HULCHL";
	public void init()
	{
		B1=new Button("Bold");
		B2=new Button("Italic");
	    B3=new Button("Bold+Italic");
		B4=new Button("Plain");
		
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString(s,100,100);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			f=new Font("Arial",Font.BOLD,40);
		}
		else if(ae.getSource()==B2)
		{
			f=new Font("Arial",Font.ITALIC,40);
		}
		else if(ae.getSource()==B3)
		{
			f=new Font("Arial",Font.PLAIN,40);
		}
		else if(ae.getSource()==B4)
		{
			f=new Font("Arial",Font.BOLD+Font.ITALIC,40);
		}
		else
		{
		}
		repaint();
	}
	
	
}
