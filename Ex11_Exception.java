public class Ex11_Exception
{
	public static void main(String s[])
	{
		try
		{
			int x,y,z;
			x=Integer.parseInt(s[0]);
			y=Integer.parseInt(s[1]);
			z=x/y;
			System.out.println("Output="+z);			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter a number");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Not a number");
		}
	}
}