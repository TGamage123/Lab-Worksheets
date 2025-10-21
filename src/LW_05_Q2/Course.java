package LW_05_Q2;

public class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = null;
        this.degreeBelongsTo = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public Integer getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void displayInfo() {
        System.out.println("Course Information:");
        System.out.println("Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
        if (lecturerInCharge != null) {
            System.out.println("Lecturer in Charge: " + lecturerInCharge.getName());
        } else {
            System.out.println("Lecturer in Charge: Not assigned");
        }
        if (degreeBelongsTo != null) {
            System.out.println("Degree: " + degreeBelongsTo.getName());
        } else {
            System.out.println("Degree: Not assigned");
        }
    }

    // Add lecturer in charge
    public void addLecturerInCharge(Lecturer lecturer) {
        if (lecturer != null) {
            this.lecturerInCharge = lecturer;
            System.out.println(lecturer.getName() + " has been assigned as lecturer in charge for " + name);
        } else {
            System.out.println("Invalid lecturer.");
        }
    }

    // Remove lecturer in charge
    public void removeLecturerInCharge() {
        if (lecturerInCharge != null) {
            System.out.println(lecturerInCharge.getName() + " has been removed as lecturer in charge for " + name);
            this.lecturerInCharge = null;
        } else {
            System.out.println("No lecturer in charge to remove.");
        }
    }

    // Add degree belongs to
    public void addDegreeBelongsTo(Degree degree) {
        if (degree != null) {
            this.degreeBelongsTo = degree;
            System.out.println(name + " has been assigned to " + degree.getName() + " degree.");
        } else {
            System.out.println("Invalid degree.");
        }
    }

    // Remove degree belongs to
    public void removeDegreeBelongsTo() {
        if (degreeBelongsTo != null) {
            System.out.println(name + " has been removed from " + degreeBelongsTo.getName() + " degree.");
            this.degreeBelongsTo = null;
        } else {
            System.out.println("No degree assignment to remove.");
        }
    }
}
