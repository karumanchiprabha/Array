//Different ways to Print Array
import java.util.*;
class  Array4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int i=0;
		int size=sc.nextInt();
		int a[]=new int[size];
	//Taking input values from user
		for (i=0;i<size;i++)
		{
			System.out.println("Enter elements:");
			a[i]=sc.nextInt();
		}
	//Printing array elements using while Loop 
	     i=0;
		while(i<size)
		{
			System.out.print(a[i]+"\t");
			i++;
		}
		/*Printing array elements using for each Loop*/
	   for(int t:a)
		{
			System.out.println("elements in array are"+ t);
		} 
		/*Printing array elements using for loop*/
		for ( i=0;i<size;i++)
		{
			System.out.println("Elements in array :"+a[i]);
		}   
	}
}
