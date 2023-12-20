import java.util.*;
class FibonacciSum
{
 public static void main(String args[])
   {
	int n,a=0,b=1,c,i,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter n value");
	n=s.nextInt();
	for(i=0;i<=n;i++)
	{
	  c=a+b;
	  System.out.println(+c);
	  a=b;
	  b=c;
	}
	if(i%2!=0)
	{
		System.out.println(sum+=a);
        }
    }
}