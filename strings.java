
public class strings {

    public static void main(String a[]) {

        // String name = new String("Rahul");
        // String name = "Rahul";
        // System.out.println(name);
        // System.out.println(name.hashCode());
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(2)); // print the character at index 2
        // System.out.println(name.concat(" Singh"));
        //String Buffer method 
        StringBuffer sb = new StringBuffer("Rahul");
        // System.out.println(sb.capacity()); // it will give 21 bit of spcae 16 + 5.
        sb.append(" Singh");
        String str = sb.toString();
        System.out.println(sb);

    }
}
