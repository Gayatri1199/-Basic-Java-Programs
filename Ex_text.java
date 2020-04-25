import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/**<applet code=Ex_text width=500 height=500>
</applet>
*/
public class Ex_text extends Applet implements ActionListener
{
	TextField t1,t2;
	Label L1,L2;
	String name="";
	String Password="";
	Button B1;
	public void init()
	{
		L1=new Label("Enter your name");
		add(L1);
		t1=new TextField(10);
		add(t1);
		t2=new TextField(10);
		add(t2);
		B1=new Button("Submit");
		add(B1);
		B1.addActionListener(this);
		t1.setText("");
		t2.setText("");
		t2.setEchoChar('*');
	}
	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getSource()==B1)
			{
				name=t1.getText();
				Password=t2.getText();
			}
			repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("YOUR NAME",200,200);
		g.drawString(name,300,200);
		g.drawString("Password",500,200);
		g.drawString(Password,600,200);
	}
}