class Student 
{
	public void show()
	{
		System.out.println("I am a student");
	}
}
class First extends Student
{
	public void show()
	{
		System.out.println("I am a 1st year student");
	}
}
class Second extends Student
{
	public void show()
	{
		System.out.println("I an second year student");
	}
}
public class Ex14_comb
{
	public void id(Student s)
	{
		if(s instance of First)
		{
			s.show();
			System.out.println("Branch is CSE");
		}
		else
		{
			s.show();
			System.out.println("Branch is ECE");
		}
	}
	public static void main(String s[])
	Ex_comb ob=new Ex14_comb();
	Student st=new Student();
	First ft=new First();
	Second sd=new Second();
	ob.id(ft);
	ob.id(sd);
	ob.id(st);
}
}