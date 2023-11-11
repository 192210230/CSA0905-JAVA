import java.util.*;
class Vote
{
 public static void main(String args[])
   {
	int x,age;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter age");
	age=s.nextInt();
	if(age>18)
	 {
		System.out.println("eligible to vote");
		x=s.nextInt();
	  }
	else
	 {
		System.out.println("not eligible to vote");
		x=18-age;
		System.out.println("no of years to vote="+x);
  	  }
     }
}