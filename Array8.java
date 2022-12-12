//Compare Two Arrays in Java
import java.util.*;
class  Array8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter sixe of the arrays a and b :");
		int asize=sc.nextInt();
		int bsize=sc.nextInt();
		int a[]=new int[asize];
		int b[]=new int[bsize];
		if (asize==bsize)
		{
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
			a[i]=sc.nextInt();
		}
	
	     System.out.println(Arrays.equals(a,b));
		} 
		else
		{
			System.out.println("-1");
		}
	}
}

