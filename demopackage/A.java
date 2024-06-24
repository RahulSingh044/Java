package demopackage;

// class Something {

//     public void show() {

//         A obj = new A();
//         System.out.println(obj.code);

//     }

// }

public class A {

    // this will throw an error that variable is not visible because you can't access the variable marks outside this class.
        // int marks = 45;

    // by using public keyword we can use the variable outisde this class, by simpoly importing the package.    
        public int number = 22;

    // this varible can be used in the same package but not outside the package even though you import the package     
        protected int code = 4576;
    
}
