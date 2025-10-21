package LW_05_Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        System.out.println("UNIVERSITY MANAGEMENT SYSTEM\n");

        // Create Department objects
        Department softwareEngDept = new Department("Software Engineering");
        Department computerScienceDept = new Department("Computer Science");

        // Create Degree objects
        Degree csDegree = new Degree("Bachelor of Computer Science", 150);
        Degree seDegree = new Degree("Bachelor of Software Engineering", 120);

        // Create Course objects
        Course oopCourse = new Course("Object-Oriented Programming", "Compulsory", 75);
        Course dataStructuresCourse = new Course("Data Structures and Algorithms", "Compulsory", 80);
        Course webDevCourse = new Course("Web Development", "Optional", 45);
        Course databaseCourse = new Course("Database Management Systems", "Compulsory", 70);

        // Create Lecturer objects
        Lecturer lecturer1 = new Lecturer("Dr. Johnson", "Senior Lecturer", softwareEngDept);
        Lecturer lecturer2 = new Lecturer("Prof. K. Dias", "Professor", computerScienceDept);
        Lecturer lecturer3 = new Lecturer("Dr. A.B. Perera", "Lecturer", softwareEngDept);

        // Create Student objects
        Student student1 = new Student("Amal Perera", "CS2021001", "Year 2", csDegree);
        Student student2 = new Student("Sanduni Nethara", "SE2021045", "Year 2", seDegree);
        Student student3 = new Student("Chamara Dias", "CS2022030", "Year 1", csDegree);


        // Set up Department relationships
        softwareEngDept.appointDepartmentHead(lecturer1);
        softwareEngDept.addLecturer(lecturer1);
        softwareEngDept.addLecturer(lecturer3);
        softwareEngDept.offerCourse(oopCourse);
        softwareEngDept.offerCourse(webDevCourse);

        computerScienceDept.appointDepartmentHead(lecturer2);
        computerScienceDept.addLecturer(lecturer2);
        computerScienceDept.offerCourse(dataStructuresCourse);
        computerScienceDept.offerCourse(databaseCourse);

        System.out.println();

        // Set up Degree relationships
        csDegree.offerCourse(oopCourse);
        csDegree.offerCourse(dataStructuresCourse);
        csDegree.offerCourse(databaseCourse);

        seDegree.offerCourse(oopCourse);
        seDegree.offerCourse(webDevCourse);
        seDegree.offerCourse(dataStructuresCourse);

        System.out.println();

        // Set up Course relationships
        oopCourse.addLecturerInCharge(lecturer1);
        oopCourse.addDegreeBelongsTo(csDegree);

        dataStructuresCourse.addLecturerInCharge(lecturer2);
        dataStructuresCourse.addDegreeBelongsTo(csDegree);

        webDevCourse.addLecturerInCharge(lecturer3);
        webDevCourse.addDegreeBelongsTo(seDegree);

        databaseCourse.addLecturerInCharge(lecturer2);
        databaseCourse.addDegreeBelongsTo(csDegree);

        System.out.println();

        // Lecturers add courses they're teaching
        lecturer1.addCourse(oopCourse);
        lecturer2.addCourse(dataStructuresCourse);
        lecturer2.addCourse(databaseCourse);
        lecturer3.addCourse(webDevCourse);

        System.out.println();

        // Students enroll in courses
        student1.enrollCourse(oopCourse);
        student1.enrollCourse(dataStructuresCourse);
        student1.enrollCourse(databaseCourse);

        student2.enrollCourse(oopCourse);
        student2.enrollCourse(webDevCourse);
        student2.enrollCourse(dataStructuresCourse);

        student3.enrollCourse(oopCourse);
        student3.enrollCourse(dataStructuresCourse);

        System.out.println("DISPLAYING UNIVERSITY INFORMATION");

        // Display Department Information
        System.out.println("DEPARTMENT INFORMATION");
        softwareEngDept.displayInfo();
        System.out.println();
        softwareEngDept.displayDepartmentHeadInfo();

        System.out.println("\n");

        computerScienceDept.displayInfo();
        System.out.println();
        computerScienceDept.displayDepartmentHeadInfo();

        System.out.println("\n\n");

        // Display Degree Information
        System.out.println("DEGREE INFORMATION");
        csDegree.displayInfo();
        csDegree.listCoursesOffering();

        System.out.println("\n");

        seDegree.displayInfo();
        seDegree.listCoursesOffering();

        System.out.println("\n\n");

        // Display Course Information
        System.out.println("COURSE INFORMATION");
        oopCourse.displayInfo();
        System.out.println();
        dataStructuresCourse.displayInfo();
        System.out.println();
        webDevCourse.displayInfo();
        System.out.println();
        databaseCourse.displayInfo();

        System.out.println("\n\n");

        // Display Lecturer Information
        System.out.println("LECTURER INFORMATION");
        lecturer1.displayInfo();
        lecturer1.displayDepartmentInfo();
        lecturer1.listCoursesTeaching();

        System.out.println("\n");

        lecturer2.displayInfo();
        lecturer2.displayDepartmentInfo();
        lecturer2.listCoursesTeaching();

        System.out.println("\n");

        lecturer3.displayInfo();
        lecturer3.displayDepartmentInfo();
        lecturer3.listCoursesTeaching();

        System.out.println("\n\n");

        // Display Student Information
        System.out.println("STUDENT INFORMATION");
        student1.displayInfo();
        student1.displayDegreeInfo();
        student1.listCoursesEnrolled();

        System.out.println("\n");

        student2.displayInfo();
        student2.displayDegreeInfo();
        student2.listCoursesEnrolled();

        System.out.println("\n");

        student3.displayInfo();
        student3.displayDegreeInfo();
        student3.listCoursesEnrolled();

    }
}