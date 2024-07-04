
class A {

    public void showTheDataOfClass () {
        System.out.println("In A Show");
    }

}

class B extends A {

    @Override  //annotation which says that this class overides the super class methods
    public void showTheDataOfClass () {
        System.out.println("In B Show");
    }

}

public class Annotation {
    public static void main(String[] args) {
        
        B obj = new B();
         

    }
}
