import java.util.*;
class DecimaltoBinary
{
 public static void main(String args[])
 {
	
	 Scanner s=new Scanner(System.in);
 	int n,res=0,r,i=0;
	System.out.println("Enter n value");
   	n=s.nextInt();
	while(n!=0)
	{
		r=n%2;
		res=res+(r*(int)Math.pow(10,i));
		n=n/2;
		i++;
	}
  System.out.println(res);
 }
}
  
