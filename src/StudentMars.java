import java.util.Scanner;

public class StudentMars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudent = input.nextInt();
        System.out.println("Enter number of subjects");
        int numberOfSubjects = input.nextInt();
        int totalMarks = 0;
        double average;
        for (int i = 0; i < numberOfStudent; i++){
            for (int j = 0; j < numberOfSubjects; j++){
                System.out.println("Enter marks of students " + (i + 1) + " in subjects  " + (j +1) + ":");
                int marks = input.nextInt();
                totalMarks += marks;

            }
            System.out.println("Total marks of students is " + totalMarks);
            average = (double) totalMarks / numberOfSubjects;
            System.out.println("Average marks of students is " + average);
            totalMarks = 0;
            if(average > 90)
                System.out.println("Grade is A");
            else if (average > 80 && average < 90)
                System.out.println("Grade is B");
            else if (average > 70 && average < 80)
                System.out.println("Grade is C");
            else if (average > 60 && average < 70)
                System.out.println("Grade is D");
            else if (average > 50 && average < 60)
                System.out.println("Grade is E");
            else
                System.out.println("Grade is F");
            System.out.println(" ");


        }
    }
}
