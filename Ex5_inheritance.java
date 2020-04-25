class A
{
	int x,y;
	A()
	{
		System.out.print("parent class constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Child class constructor");
	}
	void show()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
class C extends A
{
	C()
	{
		System.out.println("Second child constructor");
	}
	void disp()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
public class Ex5_inheritance
{
	public static void main (String s[])
	{
	B ob=new B();
	ob.x=111;
	ob.y=222;
	ob.show();
	C ob1=new C();
	ob1.x=100;
	ob1.y=200;
	ob1.disp();
	}
}