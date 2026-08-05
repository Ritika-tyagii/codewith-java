package OopsConcept;

// Question 1 - Student Report Card SystemProblem
//  StatementA school wants to develop a simple application to manage student report cards.
// Each student has:Student ID
// Student Name
// Marks (out of 100)
// The application should:Store the details of multiple students.
// Display each student's information.Display whether the student has Passed or Failed.
// If marks entered are less than 0 or greater than 100, display "Invalid Marks".
// Create at least 3 student objects and display their report cards.
// OOP Concepts Students Will LearnClassesObjectsConstructorsInstance VariablesObject Creation
 
class CourseStudent {
    public int studentId;
    public String studentName;
    private int marks;

   
    public CourseStudent(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        setmarks(marks); 
    }

    
    public CourseStudent(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = 0;
    }

    public int getmarks() {
        return marks;
    }

    public void setmarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else {
            this.marks = marks; 
        }
    }

    public void ReportCard() {
        if (marks >= 40) {
            System.out.println("Result = Passed");
        } else {
            System.out.println("Result = Failed");
        }
        System.out.println("StudentID = " + studentId);
        System.out.println("StudentName = " + studentName);
    }
}

public class StudentNewTask {
    public static void main(String[] args) {
        CourseStudent s1 = new CourseStudent(101, "A", 50);
        CourseStudent s2 = new CourseStudent(102, "B", 30);
        CourseStudent s3 = new CourseStudent(103, "C", 120);

        s1.ReportCard();
        s2.ReportCard();
        s3.ReportCard();
    }
}