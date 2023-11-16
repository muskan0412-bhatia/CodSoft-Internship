import java.util.Scanner;

public class Task2_StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize variables
        int totalMarks = 0;
        int numSubjects;

        //Input the name
        System.out.println("Enter your name:");
        String stuName = sc.nextLine();

        //Input the number of Subjects
        System.out.println("Enter the number of Subjects: ");
        numSubjects = sc.nextInt();

        // Input marks for each subject
        for (int i=1; i <= numSubjects; i++)
        {
            System.out.println("Enter the marks of subject "+i+" out of 100:");

            int marks = sc.nextInt();
            totalMarks += marks;

        }
        // Calculate Average Percentage
        double avgpercentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Assign a grade based on average percentage
        String grade;
        
        if (avgpercentage >= 90 && avgpercentage <=100){
            grade = "A";
            System.out.println("You got A grade.");
        } else if (avgpercentage >= 80 && avgpercentage < 90) {
            grade = "B";
            System.out.println("You got B grade.");
        } else if (avgpercentage >= 70 && avgpercentage < 80) {
            grade = "C";
            System.out.println("You got C grade");
        } else if (avgpercentage >= 60 && avgpercentage < 70) {
            grade = "D";
            System.out.println("You got D grade");
        } else {
            grade = "E";
            System.out.println("You got E grade");
        }
        // Display Results
        System.out.println("Total Marks " + totalMarks);
        System.out.println("Average Percentage " + avgpercentage);
        System.out.println("Grade " + grade);

        // Close the scanner
        sc.close();
    }
}
