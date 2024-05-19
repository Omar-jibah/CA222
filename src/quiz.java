import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        int num = (int)(System.currentTimeMillis()) % 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess your own number:");
        int aswer = input.nextInt();
        if (num == aswer){
            System.out.println("Well guessess! you are correct " +num);
        } else if(num > aswer){
            System.out.println("Your guess is less " +num );
        }
        else {
            System.out.println("Is higher" + num);
        }
    }
}
