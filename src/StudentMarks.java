
import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numStudents = 2;
            String[] names = new String[numStudents];
            int[][] marks = new int[numStudents][3];
            int[] totals = new int[numStudents];
            double[] averages = new double[numStudents];
            String[] grades = new String[numStudents];

            // Input student names and marks
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter name of student " + (i + 1) + ":");
                names[i] = scanner.nextLine();
                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter sub" + (j + 1) + " of student " + (i + 1) + ":");
                    marks[i][j] = scanner.nextInt();
                }
                scanner.nextLine(); // Consume newline character
            }

            // Calculate totals, averages, and grades
            for (int i = 0; i < numStudents; i++) {
                totals[i] = Arrays.stream(marks[i]).sum();
                averages[i] = totals[i] / 3.0;
                grades[i] = calculateGrade(averages[i]);
            }

            // Display menu and perform actions based on user input
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Show all");
                System.out.println("2. Search by name");
                System.out.println("3. Show all sorted by total (ascending)");
                System.out.println("4. Show all sorted by total (descending)");
                System.out.println("5. Find maximum student mark");
                System.out.println("6. Find minimum student mark");
                System.out.println("Enter your choice (1-6, 0 to exit):");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    case 1:
                        displayStudents(names, marks, totals, averages, grades);
                        break;
                    case 2:
                        System.out.println("Enter name of student:");
                        String searchName = scanner.nextLine();
                        searchByName(names, marks, totals, averages, grades, searchName);
                        break;
                    case 3:
                        sortByTotal(names, marks, totals, averages, grades, true);
                        displayStudents(names, marks, totals, averages, grades);
                        break;
                    case 4:
                        sortByTotal(names, marks, totals, averages, grades, false);
                        displayStudents(names, marks, totals, averages, grades);
                        break;
                    case 5:
                        findMaximumMark(names, marks, totals, averages, grades);
                        break;
                    case 6:
                        findMinimumMark(names, marks, totals, averages, grades);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }

        // Calculate grade based on average mark
        public static String calculateGrade(double average) {
            if (average >= 90) {
                return "A";
            } else if (average >= 80) {
                return "B";
            } else if (average >= 70) {
                return "C";
            } else if (average >= 60) {
                return "D";
            } else {
                return "F";
            }
        }

        // Display all students' information
        public static void displayStudents(String[] names, int[][] marks, int[] totals, double[] averages, String[] grades) {
            System.out.println("no\tName\tsub1\tsub2\tsub3\ttotal\tAverage\tgrade");
            System.out.println("----------------------------------------------");
            for (int i = 0; i < names.length; i++) {
                System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s%n", (i + 1), names[i], marks[i][0], marks[i][1],
                        marks[i][2], totals[i], averages[i], grades[i]);
            }
        }

        // Search for a student by name
        public static void searchByName(String[] names, int[][] marks, int[] totals, double[] averages, String[] grades,
                                        String searchName) {
            boolean found = false;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(searchName)) {
                    System.out.println("Student found:");
                    System.out.printf("Name: %s, sub1: %d, sub2: %d, sub3: %d, total: %d, average: %.2f, grade: %s%n",
                            names[i], marks[i][0], marks[i][1], marks[i][2], totals[i], averages[i], grades[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
        }

        // Sort students by total marks (ascending or descending)
        public static void sortByTotal(String[] names, int[][] marks, int[] totals, double[] averages, String[] grades,
                                       boolean ascending) {
            int[] sortedIndices = new int[names.length];
            for (int i = 0; i < names.length; i++) {
                sortedIndices[i] = i;
            }

            for (int i = 0; i < names.length - 1; i++) {
                for (int j = 0; j < names.length - i - 1; j++) {
                    boolean compareResult = ascending ? totals[sortedIndices[j]] > totals[sortedIndices[j + 1]]
                            : totals[sortedIndices[j]] < totals[sortedIndices[j + 1]];
                    if (compareResult) {
                        int temp = sortedIndices[j];
                        sortedIndices[j] = sortedIndices[j + 1];
                        sortedIndices[j + 1] = temp;
                    }
                }
            }

            // Rearrange arrays based on sorted indices
            String[] sortedNames = new String[names.length];
            int[][] sortedMarks = new int[names.length][3];
            int[] sortedTotals = new int[names.length];
            double[] sortedAverages = new double[names.length];
            String[] sortedGrades = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                sortedNames[i] = names[sortedIndices[i]];
                sortedMarks[i] = marks[sortedIndices[i]];
                sortedTotals[i] = totals[sortedIndices[i]];
                sortedAverages[i] = averages[sortedIndices[i]];
                sortedGrades[i] = grades[sortedIndices[i]];
            }

            // Update original arrays with sorted values
            System.arraycopy(sortedNames, 0, names, 0, names.length);
            System.arraycopy(sortedMarks, 0, marks, 0, names.length);
            System.arraycopy(sortedTotals, 0, totals, 0, names.length);
            System.arraycopy(sortedAverages, 0, averages, 0, names.length);
            System.arraycopy(sortedGrades, 0, grades, 0, names.length);
        }

        // Find the maximum mark among all students
        public static void findMaximumMark(String[] names, int[][] marks, int[] totals, double[] averages,
                                           String[] grades) {
            int maxTotal = totals[0];
            for (int i = 1; i < totals.length; i++) {
                if (totals[i] > maxTotal) {
                    maxTotal = totals[i];
                }
            }

            System.out.println("Maximum mark:");
            for (int i = 0; i < totals.length; i++) {
                if (totals[i] == maxTotal) {
                    System.out.printf("Name: %s, sub1: %d, sub2: %d, sub3: %d, total: %d, average: %.2f, grade: %s%n",
                            names[i], marks[i][0], marks[i][1], marks[i][2], totals[i], averages[i], grades[i]);
                }
            }
        }

        // Find the minimum mark among all students
        public static void findMinimumMark(String[] names, int[][] marks, int[] totals, double[] averages,
                                           String[] grades) {
            int minTotal = totals[0];
            for (int i = 1; i < totals.length; i++) {
                if (totals[i] < minTotal) {
                    minTotal = totals[i];
                }
            }

            System.out.println("Minimum mark:");
            for (int i = 0; i < totals.length; i++) {
                if (totals[i] == minTotal) {
                    System.out.printf("Name: %s, sub1: %d, sub2: %d, sub3: %d, total: %d, average: %.2f, grade: %s%n",
                            names[i], marks[i][0], marks[i][1], marks[i][2], totals[i], averages[i], grades[i]);
                }
            }
        }
    }


