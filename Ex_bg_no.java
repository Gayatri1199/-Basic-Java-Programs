import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**<applet code=Ex_bg_no width=500 height=500>
</applet>
*/
public class Ex_bg_no extends Applet implements ActionListener
{
	Label L1,L2,L3;
	TextField t1,t2,t3;
	Button B1;
	int r,g,b;
	Color c;
	String str="";
	public void init()
	{
		L1=new Label("RED");
		L2=new Label("Blue");
		L3=new Label("Green");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		
		B1=new Button("OK");
		
		add(L1);
		add(L2);
		add(L3);
		add(B1);
		add(t1);
		add(t2);
		add(t3);
		
		B1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		r=Integer.parseInt(t1.getText());
		g=Integer.parseInt(t2.getText());
		b=Integer.parseInt(t3.getText());
		if((r>=0&&r<=255)&&(b>=0&&b<=255)&&(g>=0&&g<=255))
		{
			c=new Color(r,g,b);
			setBackground(c);
		}
		else
		{
			str="Enter valid number";
		}
	}
	
	
}
