import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestUsingInbuilt
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter elements into Array");
        for (int i = 0; i <arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("After Sort:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Smallest Element:"+arr[1]);
    }
}
