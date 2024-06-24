
import demopackage.*;

class C extends A {

    public void abc() {
        System.out.println(code);
    }

}

public class AccessModifier {

    public static void main(String[] args) {

        A obj = new A();
        // System.out.println(obj.marks);

        System.out.println(obj.number);

    }

}
