
// final with class prevents others from inheritance

final class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class Calc {
   // final with method prevents others from overriding the method 
    final public void show() {
        System.out.println("In Calc Show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    };

}




public class FinalKeyword {
    public static void main(String[] args) {
       // final variable 
        // final int a = 10;
        // // a = 20;
        // System.out.println(a);

        Calc obj = new Calc();
        obj.show();
        obj.add(5, 8);

    }
}
