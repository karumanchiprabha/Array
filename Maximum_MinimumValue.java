import java.util.Scanner;

public class Maximum_MinimumValue
{
    public static void max(int []arr)
    {
        System.out.println();
        int max = arr[0];
        for (int i=0;i< arr.length;i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
            System.out.println("Max element in array is :" + max);
    }
    public static void min(int []arr)
    {
        //System.out.println();
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Min Value in Array:" + min);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter Elements into array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.print("Elements in the Array:");
        for (int x: arr)
        {
            System.out.print(x +" ");
        }
        max(arr);
        min(arr);
    }
}
