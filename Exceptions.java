public class Exceptions {
    public static void main(String[] args) {
        
        //normal statement 
        // i = 0 will execute the ArithmetichException catch only
        // int i = 0;
        int i = 2;
        int j = 0;

        int num[] = new int[5];
        String str = null;
        
        try {
        // critical statement
         j = 16/i;
         System.out.println(str.length());
         System.out.println(num[5]);

        }
        catch (ArithmeticException err) {
            System.out.println("Cannot Divide by zero" + err);
        }
        catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Stay in the Array's size");
        }
        catch(Exception err) {
            System.out.println("Something went wrong...");
        }

        System.out.println(j);
        System.out.println("BYE..");

    }
}
