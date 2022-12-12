import java.util.Scanner;

public class SecondLargestInArray
{
    public static void secondLargest(int []arr)
    {
        //Sorting
        for (int i = 0; i < arr.length; i++)
        {
           int temp, flag=0;
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
                if(flag==0)
                {
                    break;
                }
        }
        System.out.print("After Sorting:");
        for (int x:arr)
        {
            System.out.print(x +" ");
        }
        System.out.println();
        System.out.println("Second Largest Element:"+arr[1]);
        System.out.println("Second Smallest element :"+arr[(arr.length)-2]);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter Elemets of the:");
        for (int i = 0; i <size; i++)
        {
            arr[i]=scanner.nextInt();
        }
        secondLargest(arr);
        //secondSmallest(arr);
    }
}
