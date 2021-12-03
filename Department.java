import java.util.Vector;

public class Department {
    private final String name;
    private final String id;
    private final Vector<Course> courseList; //variable for the courses offered by the department
    private final Vector<Student> registerList; //variable for students taking courses in the department.

    public Department(String name, String id) {
        this.name = name;
        this.id = id;
        courseList = new Vector<Course>();
        registerList = new Vector<Student>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void offerCourse(Course course) {    //method to add a course to the Vector courseList
        courseList.add(course);
    }

    public void printCoursesOffered() {          //method to print the department courses
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.elementAt(i).toString());
        }
    }

    public void printStudentsByName() {         //method that prints the students registered in a department
        for (int i = 0; i < registerList.size(); i++) {
            System.out.println(registerList.elementAt(i).toString());
        }
    }

    public boolean isRegisteredInCourse(Course course) {     //method to check if a course is in a department
        return (registerList.contains(course));
    }

    public Vector<Student> studentsRegCourse(int code) {
        Vector<Student> studentsInCourse = new Vector<Student>();

        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.elementAt(i).getCourseNumber() == code) {
                studentsInCourse = courseList.elementAt(i).getClassList();
            }
        }
        return studentsInCourse;
    }

    public void registerStudentCourseInDepartment(Student studentRegDep, Course coursetoReg) {
        if (isStudentRegistered(studentRegDep)) {
            registerList.add(studentRegDep);
            studentRegDep.registerFor(coursetoReg);
        }
    }

    public boolean isStudentRegistered(Student StudentChecked) {    //method to check if a student is
        return (registerList.contains(StudentChecked));             //registered in the department's list
    }

    public void printStudentsRegisteredInCourse(int course) {        //prints all students
        Vector<Student> allStudentsInCourse = studentsRegCourse(course);
        for (int i = 0; i < allStudentsInCourse.size(); i++) {
            System.out.println(allStudentsInCourse.elementAt(i).toString());
        }

    }

    public String largestCourse() {
        Vector<Student> StudentCount = new Vector<Student>();
        int count = 0;
        String course = null;
        for (int i = 0; i < courseList.size(); i++) {
            StudentCount = courseList.elementAt(i).getClassList();
            if (StudentCount.size() > count) {
                count = StudentCount.size();
                course = courseList.elementAt(i).toString();
            }
        }
        return course;      //returns course as string
    }

    public String toString() {
        String courses = name + ":" + courseList.size() + " courses," + registerList.size() + " students";
        return courses;     //returns a string with the department name, number of courses, and number of students registered
    }
}
