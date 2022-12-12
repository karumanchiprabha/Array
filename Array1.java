//Find Length of Array in Java
import java.util.Arrays;
class Array1 
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40}; 
		int b[]=new int[5]; 
	//	int c[]=new int[-2]; //Runtime:Exception in thread "main" java.lang.NegativeArraySizeException: -1
		b[0]=1;
		b[1]=20;
		b[2]=10;
		b[3]=4;
		b[4]=40;
		System.out.println(a.length);  //4
		System.out.println(b.length);  //5
		System.out.println(b[1]);      //20
		System.out.println(b);         //[I@hascode in hexa_decimal format  //[I@3830f1c0
		System.out.println(b[b.length-2]); //4
      //System.out.println(a[6]); //Runtime:Exception java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
		
 
	   /* whenever we call a refernce varible then by default toString() method of the array class will be invoked and it
	      retun a value that is address of that ref.varible
		  It will be in a format [Arraydatatype @ refvarible */
	}
}
