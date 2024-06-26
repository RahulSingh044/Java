public class WrapperClass {
    public static void main(String[] args) {
        
        int num = 7;
        // boxing : storing a primitive data type in a wrapper class is called BOXING.
        Integer num1 = new Integer(num);

        // autoBoxing : implicitly conversion of num (primitive) to a wrapper class.
        Integer num2 = num;

        //unBoxing : getting a value of object type to primitive type
        // intValue() is a method of Integer class which is used to get the Integer value from the object.
        int num3 = num2.intValue();

        //autoUnboxing : when unboxing take place implicitly.
        int num4 = num2;

        System.out.println(num1);

    }
}
