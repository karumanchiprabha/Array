//Largest Number in Array
import java.util.*;
class  Array12
{
	    Scanner sc=new Scanner(System.in);
		
	public static void main(String[] args) 
	{
			System.out.println(largest.max);
			System.out.println("Enter size of array");
			int size =sc.nextInt();
			int max=0;
			int a[]=new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter elements:");
			a[i]=sc.nextInt();
		}
	}
	static int largest()
		{
			int max=a[0];
				for (int i=0;i<size;i++)
				{
					  if (max < a[i]) max = a[i];
				}
				return max;
		}

}
