//Copy Array in Java
import java.util.*;
class  Array9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int size=sc.nextInt();
		int a[]=new int[size];
		for (i=0;i<size;i++)
		{
			System.out.println("enter elements :");
			a[i]=sc.nextInt();
		}
		int b[]= a;
		System.out.println(Arrays.toString(b));
	}
}
