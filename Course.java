import java.util.Vector;

public class Course {
    private Department dept;
    private String code; // variable for a course code
    private int number; // variable for a course number
    private String title; // variable to identify the title of a course
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        classList = new Vector<Student>(); //initializing classList
        dept.offerCourse(this);
    }

    public Course() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        String course = code + " " + number + " " + title + ", Enrollment = " + classList.size();
        return course;              // return a string with the course code, name and number of people registered
    }

    public int getCourseNumber() {
        return number;              //returns the course number as an integer
    }

    public void addStudentToCourse(Student studentToBeAdded) {
        classList.add(studentToBeAdded);        //method to add a students to the vector classList
    }

    public Vector<Student> getClassList() {
        return classList;            //returns the Vector classList for a course
    }
}