class A extends Thread
{
	int i;
	public A(String str)
	{
		System.out.println("Status="+str);
		start();
	}
	public void run()
	{
		try
		{
			for(i=1;i<=5;i++)
			{
				System.out.println("I="+i);
				sleep(1000);
			}
			System.out.println("Child Exited");
		}
		catch(Exception e)
		{
		}
	}
}
public class Ex19_thread
{
	public static void main(String s[])
	{
		try
		{
			int j;
			A ob1=new A("Thread 1");
			for(j=1;j<=5;j++)
			{
				System.out.println("J ="+j);
				Thread.sleep(1000);
			}
			System.out.println("Main Exited");
		}
		catch(Exception e)
		{
		}
	}
}