import java.util.*;
class ConsonantsVowels
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String s1;
		char c;
		String vowels,consonants;
		System.out.println("Enter the string: ");
		s1=s.nextLine();
		int n=s1.length();
		for(int i=0;i<=n;i++)
		{
			c=s1.charAt(i);
	System.out.print("vowels are: ");
	System.out.print("consonants are: ");		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
		vowels=s.nextLine(i);
	}
	else
	{
		consonants=s.nextLine(i);
	}
}
}
}
