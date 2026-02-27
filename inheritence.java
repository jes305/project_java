

public class inheritence 

{
    public static void main(String a[])
    {
        advcalc c1 = new advcalc();
        int sum = c1.add(5, 10);
        int sub = c1.sub(10, 5);
        @SuppressWarnings("unused")
        int mul = c1.mul(5, 10);
        System.out.println("sum is " + sum);
        System.out.println("sub is " + sub);
    } 
}
