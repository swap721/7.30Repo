import java.util.Scanner;

public class primeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value");
		primeNumber p=new primeNumber();
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int swapnil=0;
		for(int i=2;i<=r/2;i++)
		{
			if(r%i==0)
			{
			System.out.println("Its not a prime number");
			swapnil=1;
			break;  //for moving outside the loop
			}
		}
	
	if (swapnil==0)
	{
		System.out.println("its a prime number");
	}
}
}
