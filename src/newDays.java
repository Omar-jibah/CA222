import java.util.Scanner;

public class newDays {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = kb.nextInt();
        boolean bool = true;
        String txt = "";
        for(int i = 1; i<=n; i++){
            if(n% i ==0){
                bool = false;
                txt += i+ ",";

            }

        }
        System.out.println(bool? n+ " is a prime ":n+ " is not prime because it divisible by: " + txt);
    }
}
