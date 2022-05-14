import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
	System.out.println("Please enter value");
	Palindrome p=new Palindrome();
	Scanner s=new Scanner(System.in);
	int number=s.nextInt();
	int sum=0;
	int oldnumber=number;
	while(number>0)
	{
		int r=number%10;
		sum=sum*10+r;
		number=number/10;
	}
	if(oldnumber==sum)
	{
		System.out.println("Its a Palindrome number");
	}
	else
	{
		System.out.println("its not a palidrome number");
	}
	

}
}
