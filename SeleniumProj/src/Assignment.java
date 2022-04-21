
public class Assignment 
{
	int deepak;
	
	public void m1 (int deepak)
	{
		deepak=deepak;
	}
	public static void main(String[] args) 
	{
		Assignment ref= new Assignment ();
		ref.m1(20);
		System.out.println("value of deepak:"+ref.deepak);
		
	}
}
