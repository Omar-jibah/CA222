import java.util.Scanner;

public class symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X,y;
        System.out.println("enter 1st integer: ");
        X = sc.nextDouble();
        System.out.println("enter 2nd integer:");
        y= sc.nextDouble();
        System.out.println("select operator +,-,*,/");
        char option;
        option=sc.next().charAt(0);
        switch (option){
        case '+':
        System.out.println(X+y);
        break;
        case'-':
            if(X< y){
                double temp;
                temp =X;
                X = y;
                y = temp;


            }
            System.out.println(X-y);

        break;
        case'*':
        System.out.println(X*y);
        break;
        case '/':
        System.out.println(y > 0?  X/y : " Y must be >  0 :" );
        break;
        default:
        System.out.println("you entered invalid operator");
    }

    }



    }

