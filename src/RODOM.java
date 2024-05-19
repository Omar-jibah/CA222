import java.util.Scanner;

public class RODOM {
    public static void main(String[] args) {
        int num1 = (int)(System.currentTimeMillis())%10;
        int num2 = (int)(System.currentTimeMillis())/10 %10;
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + " + " + num2 + "?");
        int Answer = input.nextInt();
        if (num1 + num2 == Answer){
            System.out.println("Your answer is correct " +  " The correct answer is "+(num1 + num2));
        }
        else {
            System.out.println("Incorrect answer" + " The correct answer is " + (num1 +num2));
        }
    }
}
