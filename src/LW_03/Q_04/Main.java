package LW_03.Q_04;

public class Main {
    public static void main(String[] args) {
        Course oop = new Course();
        Lecturer john = new Lecturer();
        Student kumar = new Student();

        oop.setCourseCode("ETEC 21062");
        oop.setCourseName("Object Oriented Programming");
        oop.setLic(john);

        john.setLecturerName("John Smith");
        john.setCourseTeaching("Object Oriented Programming");

        kumar.setStudentName("Kumar Sanghakkara");
        kumar.setDegreeName("ICT");
        kumar.setCourseFollowing("Object Oriented Programming");

        System.out.println("Student details: ");
        System.out.println("Name: " + kumar.getStudentName());
        System.out.println("Degree: " + kumar.getDegreeName());
        System.out.println("Course: " + kumar.getCourseFollowing());
        System.out.println();

        System.out.println("Course details: ");
        System.out.println("Code: " + oop.getCourseCode());
        System.out.println("Name: " + oop.getCourseName());
        System.out.println("LIC: " + oop.getLic().getLecturerName());
        System.out.println();

        System.out.println("Lecturer details: ");
        System.out.println("Name: " + john.getLecturerName());
        System.out.println("Course: " + john.getCourseTeaching());
    }
}
