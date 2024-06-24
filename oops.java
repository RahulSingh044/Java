// Save this as oops.java

class calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class oops {

    public static void main(String[] a) {
        int num1 = 5;
        int num2 = 10;

        calculator calc = new calculator();
        int sum = calc.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
