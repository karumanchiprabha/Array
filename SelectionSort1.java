public class SelectionSort1
{
    public static void main(String[] args)
    {
        int[] a = {10, 40, 20, 30};
        System.out.println("elements before sort:");
        for (int x:a)
        {
            System.out.println(x);
        }
        int min ,temp;
        for (int i = 0; i < a.length-1; i++)
        {
            min=i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[min])
                {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("After Sort Elements are:");
        for (int x : a)
        {
            System.out.println(x);
        }
    }
}