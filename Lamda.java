
@FunctionalInterface
// You can use only one abstract method IN A Functional Interface
// you can use lamda function with FunctionalInterface only...
interface A {
    // void show();
    // void number(int i);
    int add(int i, int j);
}

public class Lamda 
{

    public static void main(String[] args)
     {
    
        // lamda function () -> {  }
        // A obj = () ->  System.out.println("in show");
            

        // A obj1 = (int i) -> 
        // {
        //     {
        //         System.out.println("number " + i);
        //     }
        // };

        A obj2 = (int i, int j) -> 
        {
            {
                return i+j;
            }
        };

        //Alternate for obj2
        A obj 3 = (i,j) -> i+j;

        // obj.show();
        // obj.number(5);
        int result =  obj2.add(7,8);
        System.out.println(result);
    }
}
