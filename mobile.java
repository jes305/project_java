class Mobile 
{
    String brand;   //instance variable
    int price;      //instance variable
    static String name;

    public void show()
    {
        System.out.println(brand+ ":"+ price + ":" + name);
    }

    public static void show1(Mobile obj)  
    {
        System.out.println(obj.brand+ ":"+ obj.price + ":" + name);


    }

}
public class Demo
{
    public static void main(String a[])   //main methord is static bcz it is called by jvm without creating object
    {
        Mobile obj=new Mobile();
        obj.brand="samsung";
        obj.price=20000;
        Mobile.name="mobile";
        
        Mobile obj2=new Mobile();
        obj2.brand="iphone";
        obj2.price=50000;
        Mobile.name="mobile";
        

        Mobile.name="phone";

        obj.show();
        obj2.show();

        Mobile.show1(obj);  //calling using static method 
    }


}