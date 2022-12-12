//Java Program to Return an array from a method
import java.util.*;
class Array3
{
   public static void main(String args[])
   {
	    int[] a =arr();
		int[] b =array();
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Elements in the array "+a[i]);
		}
        for (int i=0;i<b.length;i++)
		{

			System.out.println("Elements in the array are" +b[i]);
		}
	}
	
   public static int[] arr()
   {
		int a[]={10,20,30,40,50};
		return a;
   }
   
		
	       static int[] array()
			{ 
			   System.out.println("********** INPUT FROM USER *********");
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enter Length of the array:");
				int length=sc.nextInt();
				int b[]=new int[length];
				for(int i=0;i<length;i++)
				{
					System.out.println("Elements are:");
					b[i]=sc.nextInt();	
				}
				return b;
			}
}
