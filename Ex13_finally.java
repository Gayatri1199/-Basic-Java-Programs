class A
{
	public void display(int x,int y)
		{
			try
			{
				int z;
				z=x/y;
				System.out.println("Output="+z);
			}
			catch(throwable e)
			{
			if(e instance of ArithmeticException)
			{
				System.out.println("Divided by 0");
			}
			else if(e instance of NumberFormatException)
			{
				System.out.println("Enter a number");
			}
			finally
			{
				System.out.println("Finally block of A");
			}
			}
		}
}
public class Ex13_finally
{
	public static void main(String a[])
	try
	{
		A ob=new A();
		ob.display(10,5);
		ob.display(10,6);
		ob.display(10,4);
	}
	catch(throwable e)
	{
	if(e instance of ArithmeticException)
	{
		System.out.println("Divided by 0");
	}
	else if(e instance of NumberFormatException)
	{
		System.out.println("Enter a number");
	}
	else 
	{
		System.out.println("Enter a number");
	}
}
finally
{
	System.out.println("Finally block of main");
}
