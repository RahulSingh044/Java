class ConditionalOperator {
    public static void main(String[] args) {
        
        int x = 8;
        int y = 10;
        int z = 5;

        if(x>y && x>z) 
          System.out.println("x is the largest");
        
        else if(y>x && y>z)
         System.out.println("y is the largest");

        else
        System.out.println("z is the largest");

        // ternary operator
        int max = (x>y)?x:y;
        System.out.println("The largest number using ternary operator is: " + max);
        
    }
}