 class  human 
 {
    private  int age;
    private  String name;
    
    public human() //defult constructor
    {
      age=12;
      name="jeswin";      
    }
    public human(int age ,String name)  //parametrised constructor
    {
        this.age=age;                   //if using int age tring name it will take local variable but using this keyword it will take instance variable
        this.name=name;
    }

    public  int getage() //getter
    {
        return age;
    }
    public void setage(int age) //setter 
    {
        this.age=age;
    }
    public void setname(String name)
    {
        this.name=name;
    }

    public  String getname()
    {
        return name;
    }
}

  
    
    
public class work
{
    public static void main(String a[]) 
    {
        human h1= new human();
        human h2=new human(18, "Navin");
        System.out.println(h1.getage() + " " + h1.getname());
        // h1.setage(23);
        // h1.setname("jeswin");

    
        //System.out.println(h1.getage() + " " + h1.getname());
    }
}

