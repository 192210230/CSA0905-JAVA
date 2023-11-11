import java.util.*;
class Swap
{
 public static void main(String args[])
   {
	int x,y,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter x value");
	x=s.nextInt();
	System.out.println("Enter y value");
	y=s.nextInt();
	temp=x;
	x=y;
	y=temp;
	System.out.println("x="+x);
	System.out.println("y="+y);
   }
}