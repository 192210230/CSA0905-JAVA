import java.util.*;
class Fibonacci
{
 public static void main(String args[])
   {
	int n,a=0,b=1,c,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter n value");
	n=s.nextInt();
	for(i=0;i<=n;i++)
	{
	  c=a+b;
	  System.out.println("output="+c);
	  a=b;
	  b=c;
	}
   }
}