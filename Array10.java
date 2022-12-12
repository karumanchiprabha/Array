//Merge two arrays in java
import java.util.*;
class Array10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sixe of the arrays a and b :");
		int i=0;
		int asize=sc.nextInt();
		int bsize=sc.nextInt();
		int a[]=new int[asize];
		int b[]=new int[bsize];
		// elemets are intilized to array refernced with a 
		for (i=0;i<asize;i++)
		{
			System.out.println("Enter elements to the a array:");
			a[i]=sc.nextInt();
		}
		
		System.out.println("****Entering into B array **** ");
		// elemets are intilized to array refernced with b
		for (i=0;i<bsize;i++)
		{
			System.out.println("Enter elements to the b  array:");
			b[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
			  sc.close();  
		
	/*	for (int t:a)
		{
			//System.out.println(t);
			
		}
		
		 
		for (int t1:b)
		{
			//System.out.println(t1);
			
		}*/
		
	}
}