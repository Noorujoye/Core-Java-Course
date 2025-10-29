class Mobile
{
    String brand;
    int price;
    static String name;

    public Mobile(String brand , int price) {
        this.brand = brand;
        this.price = price;
    }
    static
    {
        name = "Apple";
    }

    public  void MobDisplay () {
        System.out.println(brand + " " + price + name);
    }

    public  static void MobDisplay1 (Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + obj.name);
    }
}
public class Strings {

    // why we use static keyword in main method
    //because we not need to create a obj lo load the class
    public static void main(String[] args) {

        Mobile obj1 = new Mobile("Samsung", 1500);
        Mobile obj2 = new Mobile("OnePlus", 1800);

        obj1.MobDisplay();
        obj2.MobDisplay();

        Mobile.MobDisplay1(obj1);


    }
}
