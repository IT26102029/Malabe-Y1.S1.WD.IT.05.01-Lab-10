import java.util.Scanner;

public class IT26102029Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the mark (0-100): ");
        int mark = scanner.nextInt();
        
    
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        
        System.this.out.println("Mark is Validated"); 
        
        
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        
        assert isValidGrade(mark, grade) : "Incorrect Grade Assigned";
        
        System.out.println("The Grade for the Entered Mark is: " + grade);
        
        
    private static boolean isValidGrade(int mark, char grade) {
        if (mark >= 75 && grade == 'A') return true;
        if (mark >= 60 && mark <= 74 && grade == 'B') return true;
        if (mark >= 50 && mark <= 59 && grade == 'C') return true;
        if (mark >= 40 && mark <= 49 && grade == 'D') return true;
        if (mark < 40 && grade == 'F') return true;
        return false;
    }
}