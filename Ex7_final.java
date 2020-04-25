final class A
{
	final int x=10;
	A()
	{
		
	}
	final void show()
	{
		int y=20;
		System.out.println("Sum="+(x+y));
	}
}
public class Ex7_final
{
	public static void main(String s[])
	{
		A ob=new A();
		ob.show();
	}
}