import java.util.Vector;

public class Student extends Person {
    private final String id;
    private final String name;
    private final Vector courses; // vector with all courses

    public Student(String stdName, String stdId) {
        this.id = stdId;
        this.name = stdName;
        courses = new Vector();
    }

    public String getName() {   //getter method for name
        return name;
    }

    public String getId() {     //getter method for id
        return id;
    }

    public void registerFor(Course course) {
        if (courses.contains(course)) {     //if statement to do nothing according to q3
        } else {
            course.addStudentToCourse(this);
            courses.add(course);
        }
    }

    public boolean isRegisteredInCourse(Course course) {
        return (courses.contains(course)); //return boolean value only if student is already registered in a course
    }

    public String toString() {
        String student = id + " " + name + "\r\n" + "Registered courses: " + courses;
        return student;     // return a string with id, name and courses of a student
    }
}