import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        // day of the week;
        // create scanner
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter day as a name:");
        String day = kb.next();
        switch (day){
            case "Saturday":
                System.out.println(day + " is a first day of the week"); break;
            case "Sanday":
                System.out.println(day + " is a second day of the week"); break;
            case "Monday":
                System.out.println(day + " is a third day of the week"); break;
            case "Tuesday":
                System.out.println(day + " is a fourth day of the week"); break;
            case "Wednesday":
                System.out.println(day + " is a five day of the week"); break;
            case "Thursday":
                System.out.println(day + " is a six day of the week"); break;
            case "Friday":
                System.out.println(day + " is a seven day of the week"); break;
            default:
                System.out.println("invalid name");

        }
    }
}
