import java.util.*;
class Asc_Des
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String arr[]={Apple,Banana,Carrot,Jack,Raddish};
		int len=arr.length;
		char order=input.next().charAt(0);
		if(order=='A')
		{
			for(int i=0;i<len;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i].CompareTo(arr[j])>0)
					{
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(Arrays.tostring(arr));
		}
		elseif(order=='D')
		{
			for(int i=0;i<len;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i].CompareTo(arr[j])<0)
					{
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(Arrays.tostring(arr));
		}
	}
}