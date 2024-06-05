import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        int numStudents;

        do {
            System.out.print("Enter the number of students (positive integer): ");
            numStudents = scanner.nextInt();
        } while (numStudents <= 0);

        // Input grades
        System.out.println("Enter grades (0 to 100, enter -1 to finish):");
        for (int i = 0; i < numStudents; i++) {
            int grade;
            do {
                System.out.print("Student " + (i + 1) + " grade: ");
                grade = scanner.nextInt();
            } while (grade < 0 || grade > 100);
            grades.add(grade);
        }

        // Calculate average, highest, and lowest
        double average = calculateAverage(grades);
        int highest = getHighest(grades);
        int lowest = getLowest(grades);

        // Display results
        System.out.println("\nStudent Grades:");
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        scanner.close(); // Close Scanner to avoid resource leaks
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static int getHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
