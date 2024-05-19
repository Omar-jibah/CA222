import java.util.Scanner;

public class divided {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = kb.nextInt();
        if (num % 2 == 0 && num % 3 == 0)
        System.out.println("sax");
        else if (num % 2 == 0 || num % 3 == 0)
            System.out.println("ok");
        else if (num % 2 ==0 ^ num % 3 ==0)
            System.out.println("hhhh");



    }
}
