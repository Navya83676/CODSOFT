import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects;
        int totalMarks = 0;
        double averagePercentage;
        String grade;

        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        // Validate number of subjects (positive integer)
        if (numberOfSubjects <= 0) {
            System.out.println("Invalid number of subjects. Please enter a positive integer.");
            return;
        }

        // Get marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate marks (0 to 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        averagePercentage = (double) totalMarks / numberOfSubjects;

        // Determine grade based on average percentage
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}