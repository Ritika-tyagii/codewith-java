class Student {
  
    int studentId;
    String studentName;
    String course;
    int marks;
  Student(int studentId, String studentName, String course, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
    }

    boolean isPassed() {
        return marks >= 40;
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Student s1 = new Student(1, "A", "Python", 85);
        Student s2 = new Student(2, "B", "Data Analyst", 98);
        Student s3 = new Student(3, "C", "Java", 72);

        Student[] students = {s1, s2, s3};

    
        Student highest = students[0];

        for (Student s : students) {
        
            s.displayDetails();

            if (s.isPassed()) {
                System.out.println("Result       : Passed");
            } else {
                System.out.println("Result       : Failed");
            }

            if (s.marks > highest.marks) {
                highest = s;
            }
        }

      System.out.println("        ");
        System.out.println("Highest Scoring Student");
  
        highest.displayDetails();
    }
}