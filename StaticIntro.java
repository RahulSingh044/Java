
class Mobile {

    String brand;
    int price;
    static String name;  // static variable

    // static block
    static {
        // This block is called only once
        name = "Phone";
        System.out.println("In static block");
    }

    // costructor
    public Mobile() {
        // These are default values, which can be changed when you create an object.
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void display() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show() {
        System.out.println("In static method");
    }

    // In this way you can use a non-static variable in the static method
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }

}

public class StaticIntro {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Pixel";
        // obj2.price = 1800;
        // Mobile.name = "Smartphone";
        // Mobile.name = "Phone"; // this will also cahnge the name in obj1
        // obj1.display();
        // obj2.display();
        // Mobile.show();  // calling a static method
        // Mobile.show1(obj1);
        // Mobile obj3 = new Mobile();
    }
}
