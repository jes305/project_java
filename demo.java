final class Computer 
{
    String brand;
    String model;
    int ram;
    int storage;
    String pen;
    public Computer(String brand, String model, int ram, int storage,String pen) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.pen = pen;

    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Pen: " + pen);
    }
    public String getRam() {
        return "RAM: " + ram + " GB";
    }
    public String pen(int cost)
    {
        if (cost >=6)
        
            return "pen";
        else
            return "no pen";

    }
    
}
    
public class demo
{
    public static void main(String a[])
    {
        Computer com= new Computer("Dell", "Inspiron", 8, 256, "yes");
        String ramInfo = com.getRam();
        System.out.println(ramInfo);
        String str = com.pen(5);
        System.out.println(str);
        String brand = com.brand;
        System.out.println("brand: " + brand);
        String model = com.model;
        System.out.println("model: " + model);

    }

    
}
