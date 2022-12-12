class LengthOf1DArray
{
    public static void main(String[] args)
    {
        int []a= new int[]{10, 20, 30, 40, 40};
        System.out.println(a.length);
    }
}
class LengthOf2DArray
{
    public static void main(String[] args)
    {
        int [][]b={{10,20},{30,40,50}};
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(b[1].length);
    }
}
class LengthOf3DArray
{
    public static void main(String[] args)
    {
        int [][][]c={{{10,20},{1,3,5,7},{34,5,35,6}}} ;
        System.out.println(c.length);
        System.out.println(c[0].length);
        System.out.println(c[0][0].length);
        System.out.println(c[0][1]);
       // System.out.println(c[2].length);
    }
}