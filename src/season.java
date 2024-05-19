import java.util.Scanner;

public class season {
    public static void main(String[] args) {

        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String autumn = "Autumn";
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number b/w 1 to 12:");
        int number = kb.nextInt();
        System.out.println("Enter season");
        String seasons = kb.next();
       switch (seasons){
           case "Winter":
               if(number >= 1 && number <=3)
                   System.out.println( "This season is a " + winter);break;
           case "Spring":
               if (number >= 4 && number <=6)
                   System.out.println("This season is a " + spring); break;
           case "Summer":
               if (number >= 6 && number <=9)
                   System.out.println("This season is a " + summer); break;
           case "Automn":
               if (number >= 10 && number <=12)
                   System.out.println("This season is a " + autumn);
                   break;
           default:
               System.out.println( seasons + " is not valid");
       }
    }
}
