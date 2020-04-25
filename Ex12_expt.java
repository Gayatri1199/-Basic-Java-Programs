public class Ex12_expt
{
	public static void main(String a[])
	{
	try
	{
		int x,y,z;
		x=Integer.parseInt(a[0]);
		y=Integer.parseInt(a[1]);
		z=x/y;
		System.out.println("Output="+z);
	}
	catch(throwable e)
	{
	if(e instance of ArithmeticException)
	{
		System.out.println("Number cant be divided by zero");
	}
	else if(e instance of NumberFormatException)
	{
		System.out.println("Not a number");
	}
	else
	{
		System.out.println("Enter a number");
	}
	}
	}
	
}