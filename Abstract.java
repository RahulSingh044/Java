
abstract class Car {

    // declaration of method instead of defining it.
    // abstract keyword is used to declare the method as abstract, which can de declared when the class inherit its property to other class.
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("play Music");
    }

}

abstract class Wagon extends Car { 

    public void drive() {
        System.out.println("In Wagon Drive");
    }

}

class UpdateWagon extends Wagon {
    public void fly() {
        System.out.println("In Wagon Fly");
    }
}

//concrete class
public class Abstract {
    public static void main(String[] args) {
        
        Car obj = new UpdateWagon();
        obj.drive();
        obj.playMusic();
        obj.fly();  

    }
}
