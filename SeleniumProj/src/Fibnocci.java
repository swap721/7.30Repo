
public class Fibnocci 
{
	 public static void main(String[] args) 
	 {
		int a1=0;
		int a2=1;
		System.out.print(a1);
		System.out.print(" "+a2);
		for(int i=1;i<=10;i++)
		{
			int sum=a1+a2;
			System.out.print(" "+sum);
			a1=a2;
			a2=sum;
		}
	}
}
