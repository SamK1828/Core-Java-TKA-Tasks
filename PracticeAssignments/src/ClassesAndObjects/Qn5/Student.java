package ClassesAndObjects.Qn5;

class Student {
    int rollNo;
    String name;
    String grade;
    double marks;

    Student(int rollNo, String name, String grade, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade + ", Marks: " + marks);
    }
}
