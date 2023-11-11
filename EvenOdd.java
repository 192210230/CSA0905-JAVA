import java.util.*;
class EvenOdd
{
 public static void main(String args[])
   {
	int a;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a value");
	a=s.nextInt();
	if(a%2==0)
	{
		System.out.println("even");
        }
	else
	{
	 	System.out.println("odd");
	}
    }
}