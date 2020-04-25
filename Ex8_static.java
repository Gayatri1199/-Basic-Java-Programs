class A
{
	static int x;
	A()
	{
		System.out.println("COntructor block");
	}
	void show()
	{
		System.out.println("X="+x);
	}
	static
	{
		System.out.println("Static block"); 
	}
}
public class Ex8_static
{
	public static void main(String s[])
	{
		A ob =new A();
		ob.x=10;
		ob.show();
		A ob1 =new A();
		ob1.x=20;
		ob1.show();
		A ob2=new A();
		ob2.x=30;
		ob2.show();
		System.out.println("values of X for all objects");
		ob.show();
		ob1.show();
		ob2.show();
	}
	
}