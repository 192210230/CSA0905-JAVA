import java.util.*;
class Composite{
	public static void main(String args[])
	{
		
		int a,b,comp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lower bound ::");
		a = s.nextInt();
		System.out.println("Enter the upper bound ::");
		b = s.nextInt();
		System.out.println("The composite numbers are ::");
		for(int i=a+1;i<b;i++)
		{
			comp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					comp++;
				}
			}
			if(comp!=0)
			{
				System.out.println(i);
			}
		}
	}
}
