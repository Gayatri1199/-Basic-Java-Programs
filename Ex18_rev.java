import java.io.*;
public class Ex18_rev extends Thread
	{
		public static void main(String s[]) throws Exception
		{
			DataInputStream ob=new DataInputStream(System.in);
			int n;
			int rem=0;
			System.out.println("Enter a number");
			n=Integer.parseInt(ob.readLine());
			while(n!=0)
			{
				rem=rem*10+n%10;
				n=n/10;
				System.out.println("Number="+rem);
				Thread.sleep(1000);
			}
			
		}
	}