import java.io.*;
public class Ex16_dataIn
{
	public static void main(String s[])throws Exception
	{
		String name;
		int age;
		DataInputStream ob=new DataInputStream(System.in);
		System.out.println("Enter name:");
		name=ob.readLine();
		System.out.println("Enter your age");
		age=Integer.parseInt(ob.readLine());
		System.out.println("Hello"+name+"your age is"+age);
		
	}
}