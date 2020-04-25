import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_fontch width=500 height=500>
</applet>
*/
public class Ex_fontch extends Applet implements ItemListener
{
	Label L1;
	Font f;
	Checkbox ch1,ch2,ch3,ch4;
	public void init()
	{
		L1=new Label("Hello");
		ch1=new Checkbox("Bold");
		ch2=new Checkbox("Italic");
		ch3=new Checkbox("Bold and Italic");
		ch4=new Checkbox("plain");
		f=new Font("Times New Roman",Font.PLAIN,20);
		
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		ch4.addItemListener(this);
		
		add(L1);
		add(ch1);
		add(ch2);
		add(ch3);
		add(ch4);
	}
	public void ItemStateChanged(ItemEvent ie)
	{
		if(ch1.getState()==true)
		{
			f=new Font("Arial",Font.BOLD,20);
			L1.setFont(f);
		}
		else if(ch2.getState()==true)
		{
			f=new Font("Arial",Font.ITALIC,20);
			L1.setFont(f);
		}
		else if(ch3.getState()==true)
		{
			f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
			L1.setFont(f);
		}
		else
		{
			f=new Font("Arial",Font.PLAIN,20);
			L1.setFont(f);
		}
	}
	
}