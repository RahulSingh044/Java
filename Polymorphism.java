
// DYNAMIC METHOD DISPATCH Concept :

// At the time of compilation we are not sure obj.show() will call the method of which class, it will be decided at run-time, that's it's called Runtime polymorphism. 

class A {
    public void show() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C");
}
}

class Polymorphism {
    public static void main(String[] args) {

       

     // obj is refer to type A but the implentation is B 

     // It is possible to create a reference of superclass and the object of a subclass
        A obj = new A();  // it refers  to object of A
        obj.show();

        obj = new B();  // it refers to object of B
        obj.show();

        obj = new C();
        obj.show();

    }
}