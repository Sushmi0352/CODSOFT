import java.util.Scanner;

public class studentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        int numberOfSubjects;
        double averagePercentage;

        // Assuming we know the number of subjects beforehand
        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        int[] marksArray = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
            totalMarks += marksArray[i];
        }

        // Calculate Total Marks
        System.out.println("Total Marks: " + totalMarks);

        // Calculate Average Percentage
        averagePercentage = (double) totalMarks / numberOfSubjects;
        System.out.println("Average Percentage: " + averagePercentage);

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

