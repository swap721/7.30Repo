
public class Apr17 
{
	public Apr17() 
	{
		this(17,18,19);
		 System.out.println("Parent default constructor");
	}
	public Apr17(int a) 
	{
		this();
		 System.out.println("Parent 1 parameterized constructor");
	}
	public Apr17(int b,int c) 
	{
		this(17);
		 System.out.println("Parent 2 parameterized constructor");
	}
	public Apr17(int d,int e,int c) 
	{
		 System.out.println("Parent 3 parameterized constructor");
	}
}
