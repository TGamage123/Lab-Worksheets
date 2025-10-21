package LW_05_Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo(){
        System.out.println("Degree Information:");
        System.out.println("Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Number of Courses Offered: " + coursesOffering.size());
    }

    // Offer a course
    public void offerCourse(Course course) {
        if (course != null && !coursesOffering.contains(course)) {
            coursesOffering.add(course);
            System.out.println("Course '" + course.getName() + "' is now offered in this degree.");
        } else if (course != null) {
            System.out.println("Course '" + course.getName() + "' is already offered.");
        } else {
            System.out.println("Invalid course.");
        }
    }

    // Withdraw a course
    public void withdrawCourse(Course course) {
        if (coursesOffering.remove(course)) {
            System.out.println("Course '" + course.getName() + "' has been withdrawn from this degree.");
        } else {
            System.out.println("Course not found in the offering list.");
        }
    }

    // List all courses offered
    public void listCoursesOffering() {
        if (coursesOffering.isEmpty()) {
            System.out.println("No courses currently offered.");
        } else {
            System.out.println("\nCourses Offered by " + name + ":");
            for (Course course : coursesOffering) {
                course.displayInfo();
            }
        }
    }
}
