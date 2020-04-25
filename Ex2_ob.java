class A
{
	int x=10;
	int y=20;
	int z=x+y;
	void show()
	{
		System.out.println("Class with objects");
	}
	void display()
	{
		System.out.println("Sum of 10 and 20 is "+(z));
	}
}
public class Ex2_ob
{
	public static void main(String s[])
	{
		A ob=new A();
		ob.show();
		ob.display();
	}
	
}