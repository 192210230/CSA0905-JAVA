import java.util.*;
class Factors
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				i++;
			}
		}
		System.out.println("number of factors="+i);
	}
}
