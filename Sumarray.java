import java.util.*;
class Sumarray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
			int a,sum=0;
			System.out.println("Enter no of elements: ");
			a=s.nextInt();
		try
		{
			int arr[]=new int[10];
			System.out.println("Enter the elements: ");
			for(int i=1;i<=a;i++)
			{
				arr[i]=s.nextInt();
			}
			for(int i=1;i<=a;i++)
			{
				sum=sum+arr[i];
			}
			System.out.println("sum is="+sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}