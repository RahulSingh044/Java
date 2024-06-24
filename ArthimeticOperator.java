
class ArthimeticOperator {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        num1 += 2;  // this means num1 = num1 + 2;

        int result = num1++; // output : 4 -> post-increment
        int result2 = ++num1; // output : 5 -> pre-increment

        num1--; // this means num1 = num1 - 1; also known as Decrement

    }
}
