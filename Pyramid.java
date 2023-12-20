import java.util.*;
class Pyramid 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=s.nextInt();
          	for(int i=1;i<=n;i++)
		{
 			for(int j=0;j<=n-i;j++)
 				{
 					System.out.print(" ");
 				}
 			for(int k=1;k<=i;k++)
 				{
 					System.out.print("* ");
 				}
 		System.out.println();
		}
	}
}