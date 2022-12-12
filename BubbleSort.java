import java.util.Scanner;
public class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size=scanner.nextInt();
        int []a=new int[size];
        int flag=0;
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Enter element:");
            a[i] = scanner.nextInt();
        }
        System.out.println("Elements Before Sorting: ");
        for (int x:a)
        {
            System.out.println(x);
        }
        int temp;
        for (int i=0;i<a.length;i++)
        {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
                if(flag==0)  //By using we can reduce the TimeComplexcity
                {
                    break;
                }

        }
        System.out.println("Elements After Sorting");
        for (int x:a)
        {
            System.out.println(x);
        }
    }
}
