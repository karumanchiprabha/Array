import java.util.Scanner;

public class SelectionSort
{
    public static void sort(int []arr)
    {
        int index,smallNumber;
        for (int i = 0; i < arr.length; i++)
        {
            index=i;
            for (int j = 1+i; j < arr.length ; j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }
            //swap
            smallNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallNumber;
        }
        System.out.println();
        System.out.println("After Sorting:");
        for (int x:arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size= scanner.nextInt();
        int []a=new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter Elements of Array:");
            a[i]= scanner.nextInt();
        }
        System.out.print("Elements before Sorting are:");
        for (int x:a)
        {
            System.out.print(x +" ");
        }
       SelectionSort.sort(a);

    }
}
