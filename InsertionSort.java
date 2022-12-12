public class InsertionSort
{
    public static void insertionSort(int []a)
    {
        int size=a.length;
        for (int i=1;i<size;i++)
        {
            int j=i-1;
            int key=a[i];
            while(j>=0  && key<a[j])
            {
                a[j + 1] = a[j];
                j=j-1;
            }
            a[j + 1] = key;
        }
        System.out.println("After Sort:");
        for (int x:a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        int []arr={5,1,6,4,3,2};
        System.out.println("Elements before Sorting are:");
        for (int x:arr)
        {
            System.out.println(x);
        }
        insertionSort(arr);
    }
}
