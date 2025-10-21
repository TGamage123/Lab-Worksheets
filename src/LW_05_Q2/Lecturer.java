package LW_05_Q2;

import java.util.ArrayList;

public class Lecturer extends Person {
    //Private variables
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    //constructor
    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    //getter for position
    public String getPosition() {
        return position;
    }

    //setter for position
    public void setPosition(String position) {
        this.position = position;
    }

    //setter for department
    public void setDepartment(Department department) {
        this.department = department;
    }

        //Display lecturer information
    @Override
    public void displayInfo() {
        System.out.println("Lecturer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        }
        System.out.println("Number of courses teaching: " + coursesTeaching.size());
    }

    //Display department information
    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println("No department assigned.");
        }
    }

    // Add a course to the teaching list
    public void addCourse(Course course) {
        if (course != null && !coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
            System.out.println("Course " + course.getName() + "added successfully");
        } else if (course != null) {
            System.out.println("Course " + course.getName() + "is already in the teaching list.");
        }
    }

    //Remove a course from the teaching list
    public void removeCourse(Course course) {
        if (coursesTeaching.remove(course)){
            System.out.println("Course '" + course.getName() + "' removed successfully.");
        }else {
            System.out.println("Course not found in the teaching list.");
        }
    }

    //print the details of the Course
    public void listCoursesTeaching() {
        if (coursesTeaching.isEmpty()) {
            System.out.println("No courses assigned.");
        } else {
            System.out.println("\nCourses Teaching:");
            for (Course course : coursesTeaching) {
                course.displayInfo();
            }
        }
    }
}
