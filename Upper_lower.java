import java.util.*;
class Upper_lower
{
	public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter * to exit....");
	char c='0';
	int lower=0,upper=0,digit=0;
	while(c!='*')
	{
 		c=s.next().charAt(0);
 		if(c>='A' && c<='Z')
 		upper=upper+1;
 		else if(c>='a' && c<='z')
 		lower=lower+1;
 		else if(c>='0' && c<='9')
 		digit=digit+1;
}
System.out.println("Lower: "+lower);
System.out.println("Upper: "+upper);
System.out.println("Digit: "+digit);
}
}