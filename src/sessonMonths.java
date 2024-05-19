import java.util.Scanner;

public class sessonMonths {
    public static void main(String[] args) {
        // This program generates season of the months;
        //declare variable storing string  and integer values;
        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String autumn = "Autumn";
        int number;
        // scanner class'
        Scanner kb = new Scanner(System.in);
        // Ask the user to enter b/w 1 to 12;
        System.out.println("Enter number between 1 to 12;");
        number = kb.nextInt();

        if (number >= 1 && number <=3) {
            System.out.println("The season is a " + winter);

        } else if (number >=4 && number <=6) {
            System.out.println("The season is a " + spring);

        } else if (number >=7 && number <= 9) {
            System.out.println("The season is a " + summer);


        } else if (number >=10 && number <=12) {
            System.out.println("The season is a " + autumn);

        }
        else {
            System.out.println("Adiga fiiri!!");
            System.out.println("Shaqadii macalinku kuu diray wax ka baxsan ayaad qabanee see cml sxbow.");
        }


    }
}
