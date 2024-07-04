
enum Status {
    // named constant
    // 0      1         2       3
    Running, Failed, Pending, Success;
}

enum laptop {
    // all these are objects of enum laptop class 
    // it is necessary, if any of the object has a prameterized constructor method, then all the other objects must have parameterized constructor methods, if not then you had to declare a default constructor method explicitly.
    HP(2000), Dell(1500), Lenovo(2100), Acer, Asus(1000);

    private int price;

    // default constructor 
    private laptop() {
        price = 500;
    }

    private laptop(int price) { 
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enums {
    public static void main(String[] args) {

        Status s = Status.Running;

        // Status[] ss = Status.values();

        // // ordinal() -> gives the order of the constants starting from 0
        // System.out.println(s.ordinal());

        // for (Status x : ss) {
        //     System.out.println(x+" : "+ x.ordinal());
        // }

        // enums in switch
        switch(s) {
            case Running:
                    System.out.println("All Good");
                    break;
            case Failed:
                    System.out.println("Not Working");
                    break; 
            case Success:
                    System.out.println("please wait");
                    break;       
            default:
                    System.out.println("Done");
                    break;
                            
        }

        // this will allow to access a specific object of laptop at a time
        // laptop lap = laptop.Dell;
        // System.out.println(lap + ' : ' + lap.getPrice());

        for( laptop lap : laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
