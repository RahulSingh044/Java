
import java.util.*;

class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Acc to the old java concept
        System.out.println("Enter a number from 1-7: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }

        // Acc to the modern java concept
        // the break statement is replaced by the arrow (->) used just after the case statement
        System.out.println("Enter day: ");
        String Day = sc.next();
        String result = " ";

        switch (Day) {
            case "sunday", "saturday" ->
                System.out.println("Set alaram for 6am");

            case "monday" ->
                System.out.println("Set alaram for 7am");

            default ->
                System.out.println("Set alaram for 8am");
        }

        // Using switch as expression i.e. it will return something
        // Method 1
        result = switch (Day) {
            case "sunday", "saturday" ->
                "6am";

            case "monday" ->
                "7am";

            default ->
                "8am";
        };

        System.out.println("Set alaram for " + result);

        // Method 2
        result = switch (Day) {
            case "sunday", "saturday":
                yield "6am";

            case "monday":
                yield "7am";

            default:
                yield "8am";
        };

        System.out.println("Set alaram for " + result);
    }
}
