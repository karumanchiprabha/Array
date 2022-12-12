//Find the average of an Array
import java.util.*;
class  Array6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0,sum=0,avg=0;
		System.out.println("Enter length of the array");
		int length=sc.nextInt();
		int a[]=new int[length];
		for ( i=0;i<length;i++)
		{
			System.out.println("Enter elements:");
			 a[i]=sc.nextInt();
		}
		for (int t:a)
		{
			sum=sum+t;
			avg=sum/length;
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}
