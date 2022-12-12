//Sum of Two Arrays Elements
import java.util.*;
class  Array7
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40};
		int b[]={60,37,56,77};
		for (int i=0;i<a.length;i++)
		{
			for (i=0;i<b.length;i++)
			{
				int sum=a[i]+b[i];
				System.out.println("sum of : a[" + i+"]"+"b[" +i+ "]is :" +sum);
			}
		}
		
	}
}
