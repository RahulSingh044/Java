
class Human {

    // private variable can be accessible only in the same class, not outside the class 
    private int age = 20;
    private String name = "Rahul";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        Human obj = new Human();
        // you can change the private variable outisde that class
        obj.setAge(45);
        // obj.name = "Stark";

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
