
class A {
    public void show1() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B");
    }
}

class typeConversion {

    public static void main(String[] args) {
        // Type casting
        // byte b = 127;
        int a = 12;
        int b = 257;
        // This will throw incompatible types errors
        // byte k = a;
        byte m = (byte) a;

        // the output will be 1 beacuse it will perform modulus operation on b value i.e
        // 257%(range of data type), and reminder will be output... The range in case of
        // byte is from -128 to 127 which together be taken as 256
        // byte l = (byte) b;

        // float f = 8.6f;
        // int i = (int) f;

        // type promotion
        // byte r = 10;
        // byte d = 90;
        // int result = r * d;

        // Upcasting

        // System.out.println(m);

        // this is called Upcasting
        // A obj = (A) new B();
        // obj.show1();

        // Downcasting
        B obj1 = (B) new A();
        obj1.show2();

    }
}
