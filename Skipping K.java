import java.util.*;
class Skipping K
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=s.nextInt();
    System.out.println("Enter n value");
		int n=s.nextInt();
    System.out.println("Enter k value");
		int k=s.nextInt();
for(int i=m;i<=n;i=i+k+1)
{
 System.out.print(i+" ");
}
}
}
