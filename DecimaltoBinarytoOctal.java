import java.util.*;
class DecimaltoBinary
{
 public static void main(String args[])
 {
	
	 Scanner s=new Scanner(System.in);
 	int n,res=0,res1=0,r,r2,r3,i=0,j=0,n1;
	System.out.println("Enter n value");
   	n=s.nextInt();
	n1=n;
	while(n!=0)
	{
		r=n%2;
		res=res+(r*(int)Math.pow(10,i));
		n=n/2;
		i++;
	} 
		System.out.println(res);
	
	while(res!=0)
	{
		r1=res%10;
		int res1=res1*10+r1;
		res=res/10;
	} 
		System.out.println(res1);

	while(res1!=0)
	{
		r2=res1%10;
	 	res2=res2+(r2*(int)Math.pow(2,j));
		res1=res1/10;
		j++;
	}

  	System.out.println(res1);
 }
}
  
