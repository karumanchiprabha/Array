public class KthLargestElement
{
    public static void main(String[] args)
    {

        int []a={10,40,30,50,70,20};
        //Sort
        int temp,k=5;
        for (int i = 0; i <a.length; i++)
        {
            for (int j = 0; j < a.length-1; j++)
            {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j+ 1] = temp;
                }
            }
            if(i==k- 1)
            {
                System.out.println(a[i]);
                break;
            }
        }
        for (int x:a)
        {
            System.out.print(x +" ");
        }
    }
}
