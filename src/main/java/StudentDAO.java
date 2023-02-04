import java.util.*;

public class StudentDAO {
    private List<Student> students;
    private List<String> semesters;

    public StudentDAO() {
        students = new ArrayList<>();
        semesters = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMarks(int studentId, String semester, String subject, int marks) {
        if(!semesters.contains(semester))
            semesters.add(semester);
        for(Student student : students){
            if(student.getStudentId() == studentId ) {
                    Map<String, String> semSubject = new HashMap<>(){{put(semester,subject);}};
                    student.setMarks(semSubject, marks);
                    break;
            }
        }
    }

    public double getClassAverage(){
        double classSum=0,classCount=0;
        for(Student student : students) {
            classSum+=student.calculatePercentage(semesters.get(semesters.size()-1));
            classCount+=1;
        }
        return Math.round(classSum/classCount * 100.0) / 100.0;

    }
    public double getSubjectAverage(String subject){
        double subjectSum=0,studentCount=0;
        for(Student student : students) {
            subjectSum+= student.subjectSum(subject);
            studentCount+=1;
        }

        return Math.round(subjectSum/studentCount * 100.0) / 100.0;
    }
}
