public class exceptn 
{
    public static void main(String a[]) 
    {
        int n1=10;
        int n2=0;
        try
        {
            int res=n1/n2;
            System.out.println("res is " + res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
}
    
}
