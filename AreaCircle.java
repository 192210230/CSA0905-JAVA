import java.util.*;
class AreaCircle
{
 public static void main(String args[])
   {
	double area,pi,r;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter pi value");
	pi=s.nextDouble();
	System.out.println("Enter r value");
	r=s.nextDouble();
	area=pi*r*r;
	System.out.println("output="+area);
   }
}