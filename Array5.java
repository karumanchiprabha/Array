//Find the Sum of Array in Java
import java.util.*;
class  Array5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter size of the array:");
		int i=0;
		int sum=0;
		int size=sc.nextInt();
		int a[]=new int[size];
		for (i=0;i<size;i++)
		{
			System.out.println("enter elements:");
			a[i]=sc.nextInt();
		}
		for ( i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of the elements array is :"+sum);
	}
}
