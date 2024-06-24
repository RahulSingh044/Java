
class Human {

    private int age;
    private String name;

    // Parameterized Constructor
    public Human(String name, int age) {
        // System.out.println("in the constructor");
        this.age = age;
        this.name = name;
    }

    // Default Constructor
    public Human() {
        age = 25;
        name = "Yash";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class ConstructorIntro {

    public static void main(String[] args) {

        Human obj = new Human("Rahul", 15);
        Human obj1 = new Human();
        // The object is for only one time use
        new Human().getName(); // Anonymous object
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}
