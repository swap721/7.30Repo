import java.util.Scanner;

public class ScannerA1 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result:"+c);
		return c;
	}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result:"+z);
		return z;
	}
	public int multi(int a1,int b1)
	{
		int c1;
		c1=a1*b1;
		System.out.println("multi result:"+c1);
		return c1;
	}
	public void divide(int p,int q)
	{
		int r;
		r=p/q;
		System.out.println("divide result:"+r);
	}
	
	public static void main(String[] args) 
	{
		ScannerA1 s1=new ScannerA1();
		System.out.println("Please enter values");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		
		int sum=s1.sum(x1, x2);
		int sub=s1.sub(sum, x3);
		int sum1=s1.sum(sub, x4);
		int multi=s1.multi(sum1, x5);
		s1.divide(multi, x6);
		
		
	}
}
