
import java.util.Scanner;

public class CGPACalculator1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        student.setStudentName(studentName);

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        student.setStudentID(studentID);

        System.out.print("Enter the total number of subjects: ");
        int totalSubjects = scanner.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Subject " + i + ":");
            System.out.print("Enter grade (S,A, B, C, D, E): ");
            char grade = scanner.next().charAt(0);

            student.addSubjectGrade(grade);
        }

        student.calculateCGPA();

        System.out.println("\nCGPA Calculation Table:");
        System.out.println("Subject\tGrade");
        for (int i = 0; i < totalSubjects; i++) {
            System.out.println((i + 1) + "\t\t" + student.getSubjectGrade(i));
        }

        System.out.println("\nCGPA: " + student.getCGPA());
    }
}

class Student {
    private String studentName;
    private String studentID;
    private char[] subjectGrades;
    private int totalSubjects;

    public Student() {
        subjectGrades = new char[100]; // Assuming a maximum of 100 subjects
        totalSubjects = 0;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void addSubjectGrade(char grade) {
        subjectGrades[totalSubjects] = grade;
        totalSubjects++;
    }

    public char getSubjectGrade(int index) {
        return subjectGrades[index];
    }

    public double getCGPA() {
        double totalGradePoints = 0;

        for (int i = 0; i < totalSubjects; i++) {
            totalGradePoints += getGradePoints(subjectGrades[i]);
        }

        if (totalSubjects > 0) {
            return totalGradePoints / totalSubjects;
        } else {
            return 0.0; // To handle division by zero
        }
    }

    public void calculateCGPA() {
        // CGPA calculation logic
    }

    private int getGradePoints(char grade) {
        switch (Character.toUpperCase(grade)) {
            case 'S':
                return 10;
	    case 'A':
                return 9;
            case 'B':
                return 8;
            case 'C':
                return 7;
            case 'D':
                return 6;
            case 'E':
                return 5;
            default:
                return -5; // Invalid grade
        }
    }
}