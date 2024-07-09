
import java.io.IOException;
import java.util.*;

public class Input {
    public static void main(String[] args) throws IOException {
        System.err.println("Enter the number");

        // this will print the ASCI representation of the number
        // int num = System.in.read();

        // InputStreamReader in = new InputStreamReader(System.in);

        // // pass the InputStreamReader object in to bf
        // BufferedReader bf = new BufferedReader(in); 

        // //parseInt will convert the string from the readline to integer
        // int num = Integer.parseInt(bf.readLine());

        // System.out.println(num);

        // bf.close();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

        // it is not necessary, but it is used to prevent the leakage of the resource also allow others to use the resource.
        sc.close();

    }
}
