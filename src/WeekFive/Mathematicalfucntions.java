package WeekFive;

import java.util.Scanner;

public class Mathematicalfucntions {
    public static void main(String[] args) {
//        // Mathematical functions
//        System.out.println(Math.sin(0.0));
//        System.out.println(Math.cos(0));
//        System.out.println(Math.sin(Math.PI*30));
//        // min max abs
//        System.out.println(Math.min(23,24));
//        System.out.println(Math.max(23,24));
//        System.out.println(Math.abs(-34));
//        // exponentis fucntions
//        System.out.println(Math.exp(1));
//        System.out.println(Math.log(2.71));
//        System.out.println(Math.sqrt(144));
//        // rounding fucntions
//        System.out.println(" ceiling "+Math.ceil(3.2));
//        System.out.println("flooring "+ Math.floor(3.2));
//        System.out.println("using randint"+ Math.rint(3.2));
//        System.out.println("using round "+ Math.round(3.2));
//
//
//
//
//        //Charecter
//        System.out.println('a');
//        System.out.println('a'+1);
//        System.out.println('a'+ 'b' );
//        System.out.println('0' - 'b');

        // asking the user to enter a letter
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String ask= input.next();
//        char ch = ask.charAt(0);
        char ch = (char)('0'+ Math.random()*('z'-'a'+1));
        if ('a'<= ch && ch <= 'z')
            System.out.println("lower case");
        else if ('A' <= ch && ch<='Z')
            System.out.println("Uper case");
        else  if ('0'<= ch && ch <='9')
            System.out.println(" it is digit");
        else
            System.out.println("It is symbol");
        System.out.println("the generated is : "+ ch);

    }
}
