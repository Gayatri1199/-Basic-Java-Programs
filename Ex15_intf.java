interface A
{
	public void disp();
	public void call(int x,int y);
}
interface C
{
	public void mul(int p1,int p2);
}
class B implements A,C
{
	public int p,q;
	public void show()
	{
		System.out.println("p="+p+"Q="+q);
		System.out.println("Method of normal class");
	}
	public void disp()
	{
		System.out.println("Method of interface class");
	}
	public void call(int x,int y)
	{
		System.out.println("Sum of numbers of interface A"+(x+y));
	}
	public void mul(int p1,int p2)
	{
		System.out.println("Multiplication of numbers of interface"+(p1*p2));
	}
}
public class Ex15_intf
{
	public static void main(String s[])
	{
	B ob=new B();
	ob.disp();
	ob.call(10,20);
	ob.mul(11,12);
	ob.show();
	}
}