import java.awt.*;
import java.awt.event.*;
class eventtest extends Frames
{
	Frame f;
	Button b;
	Textfield Tf;
	eventtest()
	{	
		f=new Frame("Test");
		b=new Button("Click");
		Tf=new Textfield(10);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str= ae.getActionCommand();
		Tf.setText(str);
	}
}

public static void main (String args[])
{
	eventtest e=new eventtest();
}

