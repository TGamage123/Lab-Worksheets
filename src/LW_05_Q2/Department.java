package LW_05_Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.departmentHead = null;
        this.coursesOffering = new ArrayList<Course>();
        this.lecturersBelongsTo = new ArrayList<Lecturer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Department Information:");
        System.out.println("Name: " + name);
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        } else {
            System.out.println("Department Head: Not assigned");
        }
        System.out.println("Number of Lecturers: " + lecturersBelongsTo.size());
        System.out.println("Number of Courses Offered: " + coursesOffering.size());
    }

    // Appoint department head
    public void appointDepartmentHead(Lecturer lecturer) {
        if (lecturer != null) {
            this.departmentHead = lecturer;
            System.out.println(lecturer.getName() + " has been appointed as Department Head.");
        } else {
            System.out.println("Invalid lecturer.");
        }
    }

    // Display department head information
    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            System.out.println("\nDepartment Head Details:");
            departmentHead.displayInfo();
        } else {
            System.out.println("No department head appointed.");
        }
    }

    // Offer a course
    public void offerCourse(Course course) {
        if (course != null && !coursesOffering.contains(course)) {
            coursesOffering.add(course);
            System.out.println("Course '" + course.getName() + "' is now offered by the department.");
        } else if (course != null) {
            System.out.println("Course '" + course.getName() + "' is already offered.");
        } else {
            System.out.println("Invalid course.");
        }
    }

    // Withdraw a course
    public void withdrawCourse(Course course) {
        if (coursesOffering.remove(course)) {
            System.out.println("Course '" + course.getName() + "' has been withdrawn from the department.");
        } else {
            System.out.println("Course not found in the offering list.");
        }
    }

    // Add a lecturer
    public void addLecturer(Lecturer lecturer) {
        if (lecturer != null && !lecturersBelongsTo.contains(lecturer)) {
            lecturersBelongsTo.add(lecturer);
            System.out.println("Lecturer '" + lecturer.getName() + "' has been added to the department.");
        } else if (lecturer != null) {
            System.out.println("Lecturer '" + lecturer.getName() + "' is already in the department.");
        } else {
            System.out.println("Invalid lecturer.");
        }
    }

    // Remove a lecturer
    public void removeLecturer(Lecturer lecturer) {
        if (lecturersBelongsTo.remove(lecturer)) {
            System.out.println("Lecturer '" + lecturer.getName() + "' has been removed from the department.");
            // If the removed lecturer was the department head, unset the head
            if (departmentHead != null && departmentHead.equals(lecturer)) {
                departmentHead = null;
                System.out.println("Department head position is now vacant.");
            }
        } else {
            System.out.println("Lecturer not found in the department.");
        }
    }
}
