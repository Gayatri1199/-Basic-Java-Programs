class A
{
	int x,y;
	void sum(int m,int n)
	{
		System.out.println("Two numbers are"+x+"and"+y);
	}
}
class B extends A
{
	void sum(int p,int q)
	{
		super.sum(x,y);
		System.out.println("Sum of two numbers="+(x+y));
	}
}
public class Ex10_cli
{
	public static void main(String s[])
	{
		B ob=new B();
		ob.x=Integer.parseInt(s[0]);
		ob.y=Integer.parseInt(s[1]);
		ob.sum(ob.x,ob.y);
	}
}
