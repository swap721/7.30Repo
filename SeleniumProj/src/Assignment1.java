
public class Assignment1 
{
public int sum (int a , int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is :"+c);
	return c;
}

public int sub (int x, int y)
{
	int z;
	z=x-y;
	System.out.println("sub result is :"+z);
	return z;
}
	public int multi (int x1,int y1)
	{
		int z1;
		z1=x1*y1;
		System.out.println("Multi result is :"+z1);
		return z1;
	}
	
	public void div (int x2,int y2)
	{
		int z2;
		z2=x2/y2;
		System.out.println("Final result is :"+z2);
	}
	
	public static void main(String[] args) 
	{
		Assignment1 ref=new Assignment1();
		/*int sumresult=ref.sum(10, 2);
		int subresult=ref.sub(sumresult, 2);
		int sumresult1=ref.sum(subresult, 2);
		int multiresult=ref.multi(sumresult1, 2);
		ref.div(multiresult, 2);*/
		int multiresult=ref.multi(10, 2);
		int sumresult=ref.sum(multiresult, 2);
		int subresult=ref.sub(sumresult, 2);
		int subresult2=ref.sub(subresult, 2);
		int sumresult2=ref.sum(subresult2, 2);
		ref.div(sumresult2, 2);
		
		
	
	}
}
