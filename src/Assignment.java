import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        if(num1 < num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + "-" + num2 + " ?");
        int answer = input.nextInt();
        if(num1 - num2 == answer) {
            System.out.println("True " + " The answer is " + (num1 - num2));
        }
        else {
            System.out.println("False " + "The answer is "+ (num1 - num2));
        }

    }
}
