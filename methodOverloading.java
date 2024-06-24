
class Calculator {

    public int add(int a, int b) { // Line 4 together called method prototype
        return a + b;
    }

    //Changing the Number of Parameters
    public int add(int a, int b, int c) { // add(int a, int b, int c) is called method Signature 
        return a + b + c;
    }

    //Changing Data Types of the Arguments.
    public double add(double a, double b) {
        return a + b;
    }
}

public class methodOverloading {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int value = calc.add(5, 9);
        calc.add(5, 9, 12);
        calc.add(5.5, 9.7);

        System.out.println(value);
    }
}
