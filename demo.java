class Calculator
{
    public int add(int num1,int num2)
    {
        int r= num1+num2;
        return r;
    }
}
    
public class demo
{
    public static void main(String a[])
    {
        int num1=4;
        int num2=5;
        Calculator c = new Calculator();
        int result =c.add(num1,num2);
        System.out.println("Result: " + result);
    }

    
}
