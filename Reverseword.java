import java.util.*;
class Reverseword
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1;
		String s2=" ";
		int n;
		System.out.println("Enter the string: ");
		s1=s.nextLine();
		n=s1.length();
		for(int i=n-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.print(s2);
	}
}
		