class A
{
	int x,y;
	A()
	{
		System.out.println("An empty constructor");
	}
	A(int p)
	{
		x=p;
		System.out.println("paramerterized constructor with one argument and value of x="+x);
	}
	A(int p,int q)
	{
		x=p;
		y=q;
		System.out.println("paramerterized constructor with two argument and sum is="+(x+y));
	}
}
public class Ex4_constructor
{
	public static void main(String s[])
	{
		A ob=new A();
		A ob1=new A(20);
		A ob2=new A(20,30);
	}
}