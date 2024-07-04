
class A {

    int Age;

    public void show(){
        System.out.println("in show");
    }

    // inner class
    // you cannot directly call the show method which is in class B inside a class A
    class B {

        public void config() {
            System.out.println("in config");
        }

    }

    static class C {

        public void display() {
            System.out.println("in display");
        }

    }
}

abstract class X{

    public void research(){ 
        System.out.println("in abstract research");
    };
}

public class InnerClass {
    public static void main(String[] args) {

        // A obj = new A();
        // obj.show();

        // Annonymous class : they don't usually have the class keyword with them nor a className
        A obj = new A() {
            public void show(){
                System.out.println("in inner class show");
            }
        };


    // A.B , it means B belongs to A 
    // if you want to create the object of B , you need the object of A also
        A.B obj1 = obj.new B();
    
    // this only works when you make the inner class static 
        A.C obj2 = new A.C();

        obj1.config();
        obj2.display();

    // instead of creating a new class that will inherit the abstract class, we simply create a anonymous class, this shows the implementation of abstract and anonymous inner class together  
        X obj3 = new X({
            public void research(){
                System.out.println("in anonymous research");
            }
        });

        obj3.research();

    }
}
