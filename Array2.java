//Get Array Input from user  in Java
import java.util.*;
class  Array2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);   //User input
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();     //size value  
		int a[]=new int[size];      //declearation
		System.out.println("***intilizing values of array***");
		for (int i=0;i<size;i++)   
		{
			System.out.println( " eneter value of element:");
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in the array are : ");
		for (int i=0;i<size;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}
