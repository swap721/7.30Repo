
public class Apr17Main extends Apr17
{
	public Apr17Main() 
	{
		this(18,19);
		System.out.println("Child default constructor");
	}
	public Apr17Main(int x) 
	{
		this();
		System.out.println("Child 1 parameterized constructor");
	}
	public Apr17Main(int y,int z) 
	{
		super(18,19);
		System.out.println("Child 2 parameterized constructor");
	}
	public Apr17Main(int x1,int y1,int z1) 
	{
		this (17);
		System.out.println("Child 3 parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		Apr17Main a= new Apr17Main(17,18,19);
	}
}
