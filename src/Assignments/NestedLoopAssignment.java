package Assignments;

import java.util.Scanner;
fatal: unable to access 'https://github.com/omarepc/CA222.git/': error setting certificate file: C:/Program Files/Git/mingw64/ssl/certs/cacert.pem
public class NestedLoopAssignment {
    public static void main(String[] args) {
        // declare variables that hold
        // numbers of students and subjects
        int numberOfStudents , numberOfSubjects;
        // declare variables that hold average subjects
        double averageSubject;
        // declare variables that hold total marks
        int totalMarks;
       // declare variables that hold totalSubjects
        int totalSubjects = 0;
        // declare variables that hold totalSubjects
        // create scanner objects
        Scanner kb = new Scanner(System.in);
        // ask the user to enter number of students
        System.out.println("Enter number of students:");
        numberOfStudents = kb.nextInt();
        // ask the user to enter number of subjects
        System.out.println("Enter number of subjects:");
        numberOfSubjects = kb.nextInt();
            for (int i = 0; i < numberOfStudents; i++) {
                    for (int j = 0; j < numberOfSubjects; j++) {
                        System.out.println("Enter marks of student " + (i + 1) + " in subject " + (j + 1));
                        totalMarks = kb.nextInt();
                        while (totalMarks < 0 || totalMarks > 100){
                            System.out.println("hhhhhh iga daa ciyaarta");
                            System.out.println("Enter marks of student " + (i + 1) + " in subject " + (j + 1));
                            totalMarks = kb.nextInt();
                        }
                        totalSubjects += totalMarks;
                    }
                    System.out.println("Total marks \t Average marks \t Grade ");
                    System.out.println("---------------------------------------");
                    System.out.print(" " + totalSubjects + ".");
                    averageSubject = (double) totalSubjects / numberOfSubjects;
                    System.out.print("\t\t\t\t\t" + averageSubject +".");
                    totalMarks = 0;
                    totalSubjects = 0;

                    if(averageSubject  >= 90)
                        System.out.print("\t  A" + "." +" \n ");
                    else if (averageSubject >= 80 && averageSubject < 90)
                        System.out.print("\t  B" + "." + " \n ");
                    else if (averageSubject >= 70 && averageSubject < 80)
                        System.out.print("\t  C" + "." + " \n ");
                    else if (averageSubject >=60 && averageSubject < 70)
                        System.out.print("\t  D" + "." + " \n ");
                    else if (averageSubject >= 50 && averageSubject < 60)
                        System.out.print("\t  E" + "." + " \n ");
                    else
                        System.out.println("\t F" + "." + " \n ");
                System.out.println(" ");


            }




    }
}
