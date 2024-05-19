import java.util.Scanner;

public class SymbolOp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any symbol of these * , + , - , /:");
        String symbol = kb.next();
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        switch (symbol){
            case "+":
                System.out.println(num1 + num2); break;
            case "-":
                if(num2 > num1){
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                System.out.println(num1 - num2); break;
            case "*":
                System.out.println(num1 * num2); break;
            case "/":

                System.out.println( num2 == 0 ? "infinite" : num1 / num2); break;
            default:
                System.out.println("Error was taken");
        }

    }
}
