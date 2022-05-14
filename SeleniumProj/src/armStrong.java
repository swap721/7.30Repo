import java.util.Scanner;

public class armStrong 
{
	public static void main(String[] args) 
	{
	System.out.println("Please enter value");
	armStrong p=new armStrong();
	Scanner s=new Scanner(System.in);
	int number=s.nextInt();
	int sum=0;
	int oldnumber=number;
	while(number>0)
	{
		int r=number%10;
		sum=sum+r*r*r;
		number=number/10;
	}
	if(oldnumber==sum)
	{
		System.out.println("Its a armStrong number");
	}
	else
	{
		System.out.println("its not a armStrong number");
	}
	

}
}
