import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        // leap year calculating;
        // scanner creating;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = kb.nextInt();
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0)){

            System.out.println(year + " is a leap year?");
        }
        else {

            System.out.println( year + " is not the leap year ");
        }
    }
}
