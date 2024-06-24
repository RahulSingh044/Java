
// Super is a default method present in every constructor which call the default constructor of the super class.

// Every JAVA class extends to OBJECT class even though you don't mention it explicitly.

class A extends  Object {

    public char[] number;

    public A() {
        super();
        System.out.println("in A");
    }

    public A(int i) {
        super();
        System.out.println("in int A");
    }

}

class B extends A {

    public B() {
        // this will call the default constructor of super class
        super();
        System.out.println("in B");
    }

    public B(int i) {
        // super class with arguments call the parameterized constructor of super class
        // super(i);

        //  this() method without any argument is used to call the default constructor of the same class
        this();
        System.out.println("in int B");
    }

}


public class SuperMethod {
    public static void main(String[] args) {
        
        B obj = new B(5);

    }
}
