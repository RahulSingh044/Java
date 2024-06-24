import java.util.*;  // it is used to take the input from the user 

class variables{
    public static void main(String[] args){
    //    String name = "test";
    //    int age = 20;
    //    float number = 9.89;
    //    boolean isStudent = true;
    //    byte by = 127;
    //    long l = 8778l;
    //    float f = 7.8f;
    //    double d = 3.14;
    //    char c = 'k';

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number a: ");
          int a = sc.nextInt();
          
          System.out.println("Enter the number b: ");
          int b = sc.nextInt();
          
          int sum = a + b;
          System.out.println("Sum: " + sum);

    }
}