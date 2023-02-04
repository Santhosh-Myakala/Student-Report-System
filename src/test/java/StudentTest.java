import org.junit.jupiter.api.Test;

import java.util.HashMap;

class StudentTest {
    @Test
    void shouldAddMarksOfAStudentWRTSemester() {
        StudentDAO studentDAO = new StudentDAO();
        Student student1 = new Student(1, "santosh");
        studentDAO.addStudent(student1);

        studentDAO.addMarks(1, "Semester 1", "English", 80);
        studentDAO.addMarks(1, "Semester 1", "Maths", 90);
        studentDAO.addMarks(1, "Semester 1", "Science", 100);

        studentDAO.addMarks(1, "Semester 2", "English", 88);
        studentDAO.addMarks(1, "Semester 2", "Maths", 90);
        studentDAO.addMarks(1, "Semester 2", "Science", 100);

        System.out.println(student1.getMarks());
        System.out.println(student1.calculatePercentage("Semester 1"));
        System.out.println(studentDAO.getClassAverage());
        System.out.println(studentDAO.getSubjectAverage("Maths"));

    }

}