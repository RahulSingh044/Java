
// Object class : predefined class, as long as you don't have that method it will autmoatically inherit the method from the super class i.e. object class. There are some predefined methods also which you can use eg. toString(), toHashCode() etc...

class Laptop {

    String model;
    int price;

    public String toString() { 
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

}

public class ObjectClass {
    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "Dell Inspiron";
        obj1.price = 1000;

      // By default whenever you print object, it will automatically call .toString() method, which will print Laptop@hecadeciamlCode as long as you don't mention the method explicitly.
        System.out.println(obj1.toString());

        Laptop obj2 = new Laptop();
        obj2.model = "Dell Inspiron";
        obj2.price = 1000;

      // this reults in false because it will compare the hashcode for both objects instead of comparing the actual value  
        boolean result = obj1.equals(obj2);

        System.out.println(result);

    }
}
