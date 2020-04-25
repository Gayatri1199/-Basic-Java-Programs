class A
{
	int x=10;
	void show()
	{
		System.out.println("parent class X="+x);
	}
}
class B extends A
{
	int x=200;
	void show()
	{
		super.show();
		System.out.println("Child class X="+x);
		System.out.println("Sum of both values ="+(super.x+x));
	}
}
public class Ex6_super
{
	public static void main(String s[])
	{
		B ob=new B();
		ob.show();
	}
}