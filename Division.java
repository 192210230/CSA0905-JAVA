import java.util.*;
class Division
{ 
 public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int a,b;
 System.out.println("Enter a value");
 a=s.nextInt();
 System.out.println("Enter b value");
 b=s.nextInt();

try
{
 int x=a/b;
 System.out.println("Output="+x);
}
catch(Exception ex)
{
 System.out.println("Division by zero error");
 System.out.println("Change b value");
}
finally
{
 System.out.println("Always executed");
  }
 }
}
 

  