package ClassesAndObjects.ConstructorAssignments.Assignment2;

public class Student {
    int studentId;
    String studentName;
    String course;
    int year;
    double percentage;

    Student(int studentId, String studentName, String course, int year, double percentage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.year = year;
        this.percentage = percentage;
    }

    void displayDetails() {
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", Course: " + course + ", Year: " + year + ", Percentage: " + percentage);
    }

    void calculateGrade() {
        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "B.Tech", 2, 82.5);
        s1.displayDetails();
        s1.calculateGrade();
    }
}

