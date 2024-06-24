
class Calc {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

//Single level Inheritance
class AdvCalc extends Calc {

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// Multi level Inheritance
class ScCalc extends AdvCalc {

    public int power(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }

}

class Inheritance {

    public static void main(String k[]) {
        ScCalc obj = new ScCalc();
        // int r1 = obj.add(5, 7);
        int r1 = Calc.add(5, 7);
        int r2 = obj.sub(7, 5);
        int r3 = obj.multi(5, 5);
        int r4 = obj.div(4, 2);
        int r5 = obj.power(5, 5);

        System.out.println("Sum = " + r1 + " Sub = " + r2 + " Multiply = " + r3 + " Division = " + r4 + " Power =" + r5);
    }
}
