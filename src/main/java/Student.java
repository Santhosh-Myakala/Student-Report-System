import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private Map<Map<String,String>, Integer> marks;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = new HashMap<>();
    }

    public int getStudentId() {
        return studentId;
    }
    public Map<Map<String,String>, Integer> getMarks() {
        return marks;
    }
    public void setMarks(Map<String, String> semSubject, int marks) {
        this.marks.put(semSubject, marks);
    }

    public double calculatePercentage(String semester) {
        double sum=0,count=0;
        for (Map<String, String> semSubject : marks.keySet()) {
            if(semSubject.keySet().stream().findFirst().get() == semester){
                sum+=marks.get(semSubject);
                count+=1;
            }
        }
        return sum/count;
    }

    public int subjectSum(String subject){
        int sum=0;
        for (Map<String, String> semSubject : marks.keySet()) {
            if(semSubject.containsValue(subject))
                sum+=marks.get(semSubject);
        }
        return sum;
    }


}
