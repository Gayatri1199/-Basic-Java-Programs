class A
{
	int x,y;
	public A()
	{
		x=0;
		y=0;
	}
	public void show(int x,int y)
	{
		this.x=x+10;
		this.y=y+10;
		System.out.println("X="+x+"Y="+y);
	}
	public void display()
	{
		System.out.println("Now X="+x+"Y="+y);
	}
}
public class Ex17_this
{
	public static void main(String s[])
	{
		A ob=new A();
		ob.display();
		ob.show(10,20);
		ob.display();
	}
}