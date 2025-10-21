package LW_05_Q2;

import java.util.ArrayList;

public class Student extends Person{
    private String studentID, year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    //Constructor
    public Student(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<Course>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        if (degree != null) {
            System.out.println("Degree: " + degree.getName());
        }
        System.out.println("Number of courses enrolled: " + coursesEnrolled.size());
    }

    // Register for a degree
    public void registerDegree(Degree degree) {
        if (degree != null) {
            this.degree = degree;
            System.out.println("Successfully registered for degree: " + degree.getName());
        } else {
            System.out.println("Invalid degree.");
        }
    }

    // Display degree information
    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println("No degree registered.");
        }
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        if (course != null && !coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
            System.out.println("Successfully enrolled in course: " + course.getName());
        } else if (course != null) {
            System.out.println("Already enrolled in course: " + course.getName());
        } else {
            System.out.println("Invalid course.");
        }
    }

    // Unenroll from a course
    public void unenrollCourse(Course course) {
        if (coursesEnrolled.remove(course)) {
            System.out.println("Successfully unenrolled from course: " + course.getName());
        } else {
            System.out.println("Course not found in enrolled courses.");
        }
    }

    // List all enrolled courses
    public void listCoursesEnrolled() {
        if (coursesEnrolled.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("\nEnrolled Courses:");
            for (Course course : coursesEnrolled) {
                course.displayInfo();
            }
        }
    }
}
