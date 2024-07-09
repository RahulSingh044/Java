class A {
    public void show(){
    // In case of others class rather than Throws i.e. the class that is not present, it shows exception.
        // try {
        //     Class.forName("Throws");
        // }
        // catch (ClassNotFoundException) {
        //     Syste.out.println("Not able to find the class");
        // }

        // when you don't want to handle the exception in the method, you can simply use throws keyword, so that whoever call the method will handle the error..
    }

    public void seen() throws ClassNotFoundException 
    { 
        System.out.println("Not able to find the class");
    }

}

public class Throws {
    public static void main(String[] args) {
        
        A obj = new A();
        
        try {
            obj.seen();
        } 
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
