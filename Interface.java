
// class - class  ->  extends
// class - interface  -> implements
// interface - interface  ->  extends

interface A {

    // by default variable in interface is static and final i.e. you had to declare their values also.
    int age = 35;
    int name = "Rahul";

    void show();
    void congig();
}

interface X {

    void run();

}

interface Y extends X {

 

}

// concrete class
class B implements A,X {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }

}

// Abstract classs
abstract class C implements A {

    public void show() {
        System.out.println("in show");
    }

}

public class Interface {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();

        System.out.println(A.name);

    }
}