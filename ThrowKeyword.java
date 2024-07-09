
class RahulException extends Exception {
    public RahulException(String string) {
    // Exception class has it's own super constructor..So when you want to crate  your exceptions then you had to pass the arguments to the super constructor.
        super(string);
    }
}

public class ThrowKeyword {
    public static void main(String[] args) {
       
        int i = 20;
        int j = 0;
        
        try {
         j = 16/i;
         if(i!=0)
          throw new RahulException("I don't want to print the zero");
         if(j==0)
            throw new ArithmeticException();
        }
        catch(RahulException err) {
            System.out.println(err);
        }
        catch (ArithmeticException err) {
            j = 16/1;
            System.out.println("that's the default value..");
        }
        catch(Exception err) {
            System.out.println("Something went wrong..." + err);
        }

        System.out.println(j);
        System.out.println("BYE..");

    }
}
