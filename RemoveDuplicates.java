import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates
{
    public static void removeDuplicates(int []a)
    {
        System.out.println("Remove Duplicates:");
        int k=0;
        for (int i = 0; i <a.length-1; i++)
        {
            if(a[i]!=a[i+1])
            {
                a[k]=a[i];
                k++;
            }
        }

    }
    public static void main(String[] args)
    {
        int []arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Elemets to Array:");
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        removeDuplicates(arr);
    }
}
