import java.util.Scanner;

public class monthYear {
    public static void main(String[] args) {
        // This program generates months of the years;
        // declare variable that holds month as strings;
        // create scanner
        Scanner kb = new Scanner(System.in);
        //ask the user to enter any number of month;
        int month = 0;
        System.out.println("Enter any number of a month:");
        month = kb.nextInt();
        int year = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This number of days 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This number of days is 30");
                break;
            case 2:
                System.out.println("Enter a year:");
                year = kb.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {


                    System.out.println(" This number of days is a leap year and ends 29 ?");
                } else {
                    System.out.println(" This number of days is  not a leap year and ends 28");
                }



        }
    }
}
