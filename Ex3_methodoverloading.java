class A
{
	int x=10;
	int y;
	void show()
	{
		System.out.println("X="+x);
	}
	void show(int p)
	{
		x=p;
		System.out.println("X="+x);
	}
	void show(int p,int q)
	{
		x=p;
		y=q;
		System.out.println("X+Y ="+(x+y));
	}
}
public class Ex3_methodoverloading
{
	public static void main(String s[])
	{
		A ob =new A();
		ob.show();
		ob.show(20);
		ob.show(30,50);
	}
}
