import java.util.Scanner;
class calc
{
	public static void main(String a[])
	{	int i;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		switch(i)
		{
			case 1:System.out.println( "1");
			break;
			case 2: System.out.println("2");
			break;
			default: System.out.println("error") ;
			break;
		}
	}
	
}
