
public class tripleLoop 
{
	public static void main(String[] args) 
	{
		int r=5;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++)
			{
				
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k=k+1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
