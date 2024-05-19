import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = kb.nextInt();
        if(number < 0 )
            System.out.println( number + " must be greater than 0.");
        else if (number % 5 == 0 &&  number % 3 ==0) {
            System.out.println("FizzBuzz");

        } else if (number % 5 == 0) {
            System.out.println("Buzz");

        } else if (number % 3 ==0) {
            System.out.println("Fizz");

        }
    }
}
